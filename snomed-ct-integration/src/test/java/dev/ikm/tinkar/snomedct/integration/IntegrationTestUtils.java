package dev.ikm.tinkar.snomedct.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public final class IntegrationTestUtils {

    private static final Logger LOG = LoggerFactory.getLogger(IntegrationTestUtils.class);

    private IntegrationTestUtils() {
    }

    public static Path findOriginPath(String... keywords) {
        try (Stream<Path> stream = Files.walk(Path.of("..", "snomed-ct-origin", "target", "origin-sources"))
                .filter(Files::isDirectory)
                .filter(path -> Stream.of(keywords).allMatch(keyword -> path.toFile().getPath().contains(keyword)))) {
            Path directory = stream.findFirst().orElseThrow();
            LOG.info("found origin directory [{}] for keywords: {}", directory, keywords);
            return directory;
        } catch (Exception ex) {
            LOG.error("findOriginPath failed to locate directory for keywords: {}", keywords, ex);
            throw new RuntimeException(ex);
        }
    }

    public static String findEditionFromOrigin(Path origin) {
        try (Stream<Path> stream = Files.list(origin)
                .filter(path -> path.toFile().getName().startsWith("sct2_Concept_Snapshot"))) {
            String[] nameParts = stream.findFirst().orElseThrow().toFile().getName().split("_");
            return nameParts[3];
        } catch (Exception ex) {
            LOG.error("findOriginEdition failed to determine edition", ex);
            throw new RuntimeException(ex);
        }
    }

    public static String findVersionFromOrigin(Path origin) {
        try (Stream<Path> stream = Files.list(origin)
                .filter(path -> path.toFile().getName().startsWith("sct2_Concept_Snapshot"))) {
            String[] nameParts = stream.findFirst().orElseThrow().toFile().getName().split("_");
            return nameParts[4].substring(0, 8);
        } catch (Exception ex) {
            LOG.error("findOriginVersion failed to determine version", ex);
            throw new RuntimeException(ex);
        }
    }

}
