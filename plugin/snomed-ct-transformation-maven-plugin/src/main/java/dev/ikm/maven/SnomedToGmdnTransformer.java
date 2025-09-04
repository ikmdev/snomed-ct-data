package dev.ikm.maven;

import dev.ikm.tinkar.common.id.PublicIds;
import dev.ikm.tinkar.common.id.impl.IntIdSetArray;
import dev.ikm.tinkar.composer.Composer;
import dev.ikm.tinkar.composer.Session;
import dev.ikm.tinkar.composer.assembler.SemanticAssembler;
import dev.ikm.tinkar.entity.EntityService;
import dev.ikm.tinkar.terms.EntityProxy;
import dev.ikm.tinkar.terms.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class SnomedToGmdnTransformer extends AbstractTransformer {
    private static final Logger LOG = LoggerFactory.getLogger(SnomedToGmdnTransformer.class);

    private static final int ID = 0;
    private static final int EFFECTIVE_TIME = 1;
    private static final int ACTIVE = 2;
    private static final int MODULE_ID = 3;
    private static final int REFSET_ID = 4;
    private static final int REFERENCED_COMPONENT_ID = 5;
    private static final int MAP_TARGET = 6;

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd");

    SnomedToGmdnTransformer(UUID namespace) {
        super(namespace);
    }

    @Override
    public void transform(File inputFile, Composer composer) {
        EntityProxy.Concept author = SnomedUtility.getUserConcept(namespace);
        EntityProxy.Concept path = SnomedUtility.getPathConcept();

        AtomicInteger conceptCount = new AtomicInteger();
        try (Stream<String> lines = Files.lines(inputFile.toPath())) {
            lines.skip(1) //skip first line, i.e. header line
                    .map(row -> row.split("\t"))
                    .forEach(data -> {
                        State state = "1".equals(data[ACTIVE]) ? State.ACTIVE : State.INACTIVE;
                        long time = LocalDate.parse(data[EFFECTIVE_TIME], DATE_FORMAT).atStartOfDay().atZone(ZoneOffset.UTC).toInstant().toEpochMilli();
                        EntityProxy.Concept module = EntityProxy.Concept.make(PublicIds.of(SnomedUtility.generateUUID(namespace, data[MODULE_ID])));

                        EntityProxy.Semantic semantic = EntityProxy.Semantic.make(PublicIds.of(SnomedUtility.generateUUID(namespace, data[ID])));
                        EntityProxy.Concept snomedConcept = EntityProxy.Concept.make(PublicIds.of(SnomedUtility.generateUUID(namespace, data[REFERENCED_COMPONENT_ID])));
                        EntityProxy.Concept gmdnConcept = EntityProxy.Concept.make(PublicIds.of(SnomedUtility.generateUUID(namespace, "GMDN_" + data[MAP_TARGET])));

                        Session session = composer.open(state, time, author, module, path);

                        if (EntityService.get().getEntity(snomedConcept.publicId()).isEmpty()) {
                            LOG.warn("SNOMED Concept does not exist with SCTID: {}", data[REFERENCED_COMPONENT_ID]);
                            return;
                        }

                        if (EntityService.get().getEntity(gmdnConcept.publicId()).isEmpty()) {
                            LOG.warn("GMDN Concept does not exist with term code: {}", data[MAP_TARGET]);
                            return;
                        }

                        session.compose((SemanticAssembler assembler) -> assembler
                                .semantic(semantic)
                                .pattern(SnomedUtility.SNOMED_TO_GMDN_PATTERN)
                                .reference(snomedConcept)
                                .fieldValues(fieldValues -> fieldValues
                                        .with(IntIdSetArray.newIntIdSet(gmdnConcept.nid()))
                                ));

                        if (conceptCount.incrementAndGet() % 5000 == 0) {
                            LOG.debug("conceptCount: {}", conceptCount.get());
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            LOG.info("conceptCount: {}", conceptCount.get());
        }
    }

}
