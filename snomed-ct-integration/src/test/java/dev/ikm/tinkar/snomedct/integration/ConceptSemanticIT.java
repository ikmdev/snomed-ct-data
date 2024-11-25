package dev.ikm.tinkar.snomedct.integration;

import dev.ikm.tinkar.common.id.PublicIds;
import dev.ikm.tinkar.common.service.CachingService;
import dev.ikm.tinkar.common.service.PrimitiveData;
import dev.ikm.tinkar.common.service.ServiceKeys;
import dev.ikm.tinkar.common.service.ServiceProperties;
import dev.ikm.tinkar.common.util.uuid.UuidUtil;
import dev.ikm.tinkar.coordinate.stamp.StateSet;
import dev.ikm.tinkar.terms.EntityProxy;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

public class ConceptSemanticIT {
    @BeforeAll
    public static void setup() {
        CachingService.clearAll();
        File datastore = new File(System.getProperty("user.home") + "/Solor/September2024_ConnectathonDataset_v1");
        ServiceProperties.set(ServiceKeys.DATA_STORE_ROOT, datastore);
        PrimitiveData.selectControllerByName("Open SpinedArrayStore");
        PrimitiveData.start();
    }

    @AfterAll
    public static void shutdown() {
        PrimitiveData.stop();
    }

    @Test
    public void testConceptSemantics() throws IOException {
        String sourceFilePath = System.getProperty("user.home") + "/data/SnomedCT_InternationalRF2_PRODUCTION_20240201T120000Z/Full/Terminology/sct2_Concept_Full_INT_20240201.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("id")) continue;
                String[] columns = line.split("\\t");

                //pass these args in assertion method
                UUID id = UuidUtil.fromSNOMED(columns[0]);
                long effectiveTime = SnomedUtility.snomedTimestampToEpochSeconds(columns[1]);
                StateSet descriptionStatus = Integer.parseInt(columns[2]) == 1 ? StateSet.ACTIVE : StateSet.INACTIVE;
                EntityProxy.Concept moduleId = EntityProxy.Concept.make(PublicIds.of(UuidUtil.fromSNOMED(columns[3])));

            }
        }
    }

}
