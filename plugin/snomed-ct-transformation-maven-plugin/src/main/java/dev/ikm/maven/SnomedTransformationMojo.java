package dev.ikm.maven;

import dev.ikm.tinkar.common.service.CachingService;
import dev.ikm.tinkar.common.service.PrimitiveData;
import dev.ikm.tinkar.common.service.ServiceKeys;
import dev.ikm.tinkar.common.service.ServiceProperties;
import dev.ikm.tinkar.composer.Composer;
import dev.ikm.tinkar.composer.Session;
import dev.ikm.tinkar.composer.assembler.ConceptAssembler;
import dev.ikm.tinkar.composer.template.Definition;
import dev.ikm.tinkar.composer.template.FullyQualifiedName;
import dev.ikm.tinkar.composer.template.Identifier;
import dev.ikm.tinkar.composer.template.StatedAxiom;
import dev.ikm.tinkar.composer.template.Synonym;
import dev.ikm.tinkar.entity.EntityService;
import dev.ikm.tinkar.terms.EntityProxy;
import dev.ikm.tinkar.terms.State;
import dev.ikm.tinkar.terms.TinkarTerm;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.UUID;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static dev.ikm.tinkar.terms.TinkarTerm.DESCRIPTION_NOT_CASE_SENSITIVE;
import static dev.ikm.tinkar.terms.TinkarTerm.ENGLISH_LANGUAGE;

@Mojo(name = "run-snomed-transformation", defaultPhase = LifecyclePhase.INSTALL)
public class SnomedTransformationMojo extends AbstractMojo {
    private static final Logger LOG = LoggerFactory.getLogger(SnomedTransformationMojo.class.getSimpleName());

    @Parameter(property = "origin.namespace", required = true)
    String namespaceString;
    @Parameter(property = "datastorePath", required = true)
    private String datastorePath;
    @Parameter(property = "inputDirectoryPath", required = true)
    private String inputDirectoryPath;
    @Parameter(property = "dataOutputPath", required = true)
    private String dataOutputPath;
    @Parameter(property = "controllerName", defaultValue = "Open SpinedArrayStore")
    private String controllerName;
    @Parameter(property = "skipUnzip", defaultValue = "false")
    private boolean skipUnzip;

    private UUID namespace;

    public void execute() throws MojoExecutionException {
        try {
            this.namespace = UUID.fromString(namespaceString);

            File datastore = new File(datastorePath);
            LOG.info("inputDirectoryPath: " + inputDirectoryPath);
            File inputFileOrDirectory;
            if (skipUnzip) {
                inputFileOrDirectory = new File(inputDirectoryPath);
            } else {
                String unzippedData = unzipRawData(inputDirectoryPath);
                LOG.info("unzippedData: " + unzippedData);
                inputFileOrDirectory = new File(unzippedData);
            }
            LOG.info("inputFileOrDirectory: " + inputFileOrDirectory);
            validateInputDirectory(inputFileOrDirectory);

            transformFile(datastore, inputFileOrDirectory);
        } catch (IllegalArgumentException e) {
            throw new MojoExecutionException("Invalid namespace for UUID formatting");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String unzipRawData(String zipFilePath) throws IOException {
        File outputDirectory = new File(dataOutputPath);
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath))) {
            ZipEntry zipEntry;
            while ((zipEntry = zis.getNextEntry()) != null) {
                File newFile = new File(outputDirectory, zipEntry.getName());
                if (zipEntry.isDirectory()) {
                    newFile.mkdirs();
                } else {
                    new File(newFile.getParent()).mkdirs();
                    try (FileOutputStream fos = new FileOutputStream(newFile)) {
                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = zis.read(buffer)) > 0) {
                            fos.write(buffer, 0, len);
                        }
                    }
                }
                zis.closeEntry();
            }
        }
        return outputDirectory.getAbsolutePath();
    }

    private Path searchTerminologyFolder(File baseDirectory, String parentDir) {
        Path dataDirectory = baseDirectory.toPath().resolve("src", parentDir);
        try (Stream<Path> stream = Files.walk(dataDirectory)) {
            return stream
                    .filter(file -> file.toFile().isDirectory() && "Full".equals(file.toFile().getName()))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("'Terminology' folder could not be found in: " + dataDirectory));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private void validateInputDirectory(File inputFileOrDirectory) throws MojoExecutionException {
        if (!inputFileOrDirectory.exists()) {
            throw new RuntimeException("Invalid input directory or file. Directory or file does not exist");
        }
    }

    /**
     * Transforms each snomed file in a directory based on filename
     *
     * @param datastore     location of datastore to write entities to
     * @param baseDirectory directory containing origin files
     */
    public void transformFile(File datastore, File baseDirectory) {
        LOG.info("########## Snomed Transformer Starting...");
        initializeDatastore(datastore);

        EntityService.get().beginLoadPhase();
        try {
            Composer composer = new Composer("Snomed Transformer Composer");
            createAuthor(composer);

            File snomedDirectory = searchTerminologyFolder(baseDirectory, "snomedFull").resolve("Terminology").toFile();

            if (snomedDirectory.getAbsolutePath().contains("International")) {
                LOG.info("Processing GMDN Datasets...");
                processFilesFromInput(baseDirectory.toPath().resolve("src", "gmdnDevice").toFile(), composer);
                processFilesFromInput(searchTerminologyFolder(baseDirectory, "gmdnMapping").resolve("Refset", "Map").toFile(), composer);
            }

            processFilesFromInput(snomedDirectory, composer);

            composer.commitAllSessions();
        } finally {
            EntityService.get().endLoadPhase();
            PrimitiveData.stop();
            LOG.info("########## Snomed Transformer Finishing...");
        }
    }

    private void createAuthor(Composer composer) {
        EntityProxy.Concept snomedAuthor = SnomedUtility.getUserConcept(namespace);
        EntityProxy.Concept snomedCoreModule = EntityProxy.Concept.make("SNOMED CT Core Module", SnomedUtility.generateUUID(namespace, "900000000000207008"));

        Session session = composer.open(State.ACTIVE,
                snomedAuthor,
                snomedCoreModule,
                TinkarTerm.DEVELOPMENT_PATH);

        session.compose((ConceptAssembler concept) -> concept
                .concept(snomedAuthor)
                .attach((FullyQualifiedName fqn) -> fqn
                        .language(ENGLISH_LANGUAGE)
                        .text("IHTSDO SNOMED CT Author")
                        .caseSignificance(DESCRIPTION_NOT_CASE_SENSITIVE)
                )
                .attach((Synonym synonym) -> synonym
                        .language(ENGLISH_LANGUAGE)
                        .text("SNOMED CT Author")
                        .caseSignificance(DESCRIPTION_NOT_CASE_SENSITIVE)
                )
                .attach((Definition definition) -> definition
                        .language(ENGLISH_LANGUAGE)
                        .text("International Health Terminology Standards Development Organisation (IHTSDO) SNOMED CT Author")
                        .caseSignificance(DESCRIPTION_NOT_CASE_SENSITIVE)
                )
                .attach((Identifier identifier) -> identifier
                        .source(TinkarTerm.UNIVERSALLY_UNIQUE_IDENTIFIER)
                        .identifier(snomedAuthor.asUuidArray()[0].toString())
                )
                .attach((StatedAxiom statedAxiom) -> statedAxiom
                        .isA(TinkarTerm.USER)
                )
        );
    }

    private void initializeDatastore(File datastore) {
        CachingService.clearAll();
        ServiceProperties.set(ServiceKeys.DATA_STORE_ROOT, datastore);
        PrimitiveData.selectControllerByName(controllerName);
        PrimitiveData.start();
    }

    private void processFilesFromInput(File inputFileOrDirectory, Composer composer) {
        LOG.info("processFilesFromInput: {}", inputFileOrDirectory);
        if (inputFileOrDirectory.isDirectory()) {
            Arrays.stream(inputFileOrDirectory.listFiles())
                    .filter(file -> file.getName().endsWith(".txt") || file.getName().endsWith(".xml"))
                    .forEach(file -> processIndividualFile(file, composer));
        } else if (inputFileOrDirectory.isFile() && (inputFileOrDirectory.getName().endsWith(".txt")
                || inputFileOrDirectory.getName().endsWith(".xml"))) {
            processIndividualFile(inputFileOrDirectory, composer);
        }
    }

    private void processIndividualFile(File file, Composer composer) {
        String absolutePath = file.getAbsolutePath();
        Transformer transformer = getTransformer(absolutePath);

        if (transformer != null) {
            LOG.info("### Transformer Starting for file: " + file.getName());
            transformer.transform(file, composer);
            LOG.info("### Transformer Finishing for file: " + file.getName());
        } else {
            LOG.warn("This file cannot be processed: " + absolutePath);
        }
    }

    /**
     * Checks files for matching keywords and uses appropriate transformer
     *
     * @param absolutePath of file for Transformer match
     */
    private Transformer getTransformer(String absolutePath) {
        if (absolutePath.contains("snomedFull")) {
            if (absolutePath.contains("Concept")) {
                return new ConceptTransformer(namespace);
            } else if (absolutePath.contains("Definition")) {
                return new DefinitionTransformer(namespace);
            } else if (absolutePath.contains("Description")) {
                return new DescriptionTransformer(namespace);
            } else if (absolutePath.contains("Language")) { // TODO this file is not in Terminology directory
                return new LanguageTransformer(namespace);
            } else if (absolutePath.contains("Identifier")) {
                return new IdentifierTransformer(namespace);
            } else if (absolutePath.contains("OWLExpression")) {
                return new AxiomSyntaxTransformer(namespace);
            }
        } else if (absolutePath.contains("gmdnMapping")) {
            if (absolutePath.contains("GMDNMapSimpleMapFull")) {
                return new SnomedToGmdnTransformer(namespace);
            }
        } else if (absolutePath.contains("gmdnDevice")) {
            if (absolutePath.contains("gmdnData")) {
                return new GmdnTermsTransformer(namespace);
            }
        }
        return null;
    }
}
