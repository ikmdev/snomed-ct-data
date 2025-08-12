package dev.ikm.maven;

import dev.ikm.tinkar.common.id.PublicIds;
import dev.ikm.tinkar.composer.Composer;
import dev.ikm.tinkar.composer.Session;
import dev.ikm.tinkar.composer.assembler.ConceptAssembler;
import dev.ikm.tinkar.composer.template.DefinitionConsumer;
import dev.ikm.tinkar.composer.template.FullyQualifiedName;
import dev.ikm.tinkar.composer.template.Identifier;
import dev.ikm.tinkar.composer.template.StatedAxiom;
import dev.ikm.tinkar.terms.EntityProxy;
import dev.ikm.tinkar.terms.State;
import dev.ikm.tinkar.terms.TinkarTerm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Stream;

public class GmdnTermsTransformer extends AbstractTransformer {
    private static final Logger LOG = LoggerFactory.getLogger(GmdnTermsTransformer.class);

    GmdnTermsTransformer(UUID namespace) {
        super(namespace);
    }

    /**
     * transforms concept file into entity
     *
     * @param inputFile concept input txt file
     */
    @Override
    public void transform(File inputFile, Composer composer) {
        // TODO GMDN Agency starter concepts
        EntityProxy.Concept author = SnomedUtility.getUserConcept(namespace);
        EntityProxy.Concept path = SnomedUtility.getPathConcept();
        EntityProxy.Concept module = EntityProxy.Concept.make("SNOMED CT Core Module", SnomedUtility.generateUUID(namespace, "900000000000207008"));

        try {
            List<GmdnTerm> terms = parseGmdnXml(inputFile);
            terms.forEach(gmdnTerm -> {
                State status = "Active".equals(gmdnTerm.termStatus()) ? State.ACTIVE : State.INACTIVE;
                long time = gmdnTerm.latestDate().atStartOfDay().atZone(ZoneOffset.UTC).toInstant().toEpochMilli();
                Session session = composer.open(status, time, author, module, path);

                EntityProxy.Concept concept = EntityProxy.Concept.make(PublicIds.of(SnomedUtility.generateUUID(namespace, "GMDN_" + gmdnTerm.termCode())));
                session.compose((ConceptAssembler conceptAssembler) -> conceptAssembler
                        .concept(concept)
                        .attach((Identifier identifier) -> identifier
                                .source(TinkarTerm.UNIVERSALLY_UNIQUE_IDENTIFIER)
                                .identifier(concept.asUuidArray()[0].toString())
                        )
                        .attach((FullyQualifiedName fqn) -> fqn
                                .language(TinkarTerm.ENGLISH_LANGUAGE)
                                .text(gmdnTerm.termName())
                                .caseSignificance(TinkarTerm.DESCRIPTION_NOT_CASE_SENSITIVE)
                        )
                        .attach((DefinitionConsumer) definition -> definition.language(TinkarTerm.ENGLISH_LANGUAGE)
                                .text(gmdnTerm.termDefinition())
                                .caseSignificance(TinkarTerm.DESCRIPTION_NOT_CASE_SENSITIVE)
                        )
                        .attach((Identifier identifier) -> identifier
                                .source(GudidTerm.GUDID_GMDN_TERMS)
                                .identifier(gmdnTerm.termCode())
                        )
                        .attach((StatedAxiom statedAxiom) -> statedAxiom
                                .isA(GudidTerm.GUDID_GMDN_TERMS)
                        )
                );
            });
            LOG.info("conceptCount: {}", terms.size());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private List<GmdnTerm> parseGmdnXml(File inputFile) throws Exception {
        Document document = DocumentBuilderFactory.newInstance()
                .newDocumentBuilder()
                .parse(inputFile);

        NodeList nodes = document.getElementsByTagName("term");
        List<GmdnTerm> terms = new ArrayList<>(nodes.getLength());

        for (int i = 0; i < nodes.getLength(); i++) {
            NodeList childNodes = nodes.item(i).getChildNodes();
            Map<String, String> row = new HashMap<>(childNodes.getLength());
            for (int j = 0; j < childNodes.getLength(); j++) {
                Node childNode = childNodes.item(j);
                if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                    row.put(childNode.getNodeName(), childNode.getTextContent());
                }
            }
            terms.add(GmdnTerm.fromMap(row));
        }

        return terms;
    }

    record GmdnTerm(String termCode, String termName, String termDefinition, String termStatus,
                    String termIsIVD, String createdDate, String modifiedDate, String obsoletedDate) {
        static GmdnTerm fromMap(Map<String, String> row) {
            return new GmdnTerm(row.get("termCode"), row.get("termName"), row.get("termDefinition"), row.get("termStatus"),
                    row.get("termIsIVD"), row.get("createdDate"), row.get("modifiedDate"), row.get("obsoletedDate"));
        }

        LocalDate latestDate() {
            return Stream.of(createdDate, modifiedDate, obsoletedDate)
                    .filter(Objects::nonNull).map(LocalDate::parse)
                    .sorted().toList().getLast();
        }
    }

}
