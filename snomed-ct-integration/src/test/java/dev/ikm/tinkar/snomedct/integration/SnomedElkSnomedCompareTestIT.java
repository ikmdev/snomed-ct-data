package dev.ikm.tinkar.snomedct.integration;

import dev.ikm.elk.snomed.test.SnomedVersion;
import dev.ikm.tinkar.common.service.PrimitiveData;
import dev.ikm.tinkar.common.service.ServiceKeys;
import dev.ikm.tinkar.common.service.ServiceProperties;
import dev.ikm.tinkar.reasoner.elksnomed.test.ElkSnomedCompareTestBase;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled
public class SnomedElkSnomedCompareTestIT extends ElkSnomedCompareTestBase implements SnomedVersion {

    private static final Logger LOG = LoggerFactory.getLogger(SnomedElkSnomedCompareTestIT.class);

    private static Path origin;

    @BeforeAll
    public static void startPrimitiveData() {
        origin = IntegrationTestUtils.findOriginPath("snomedFull", "SnomedCT_").resolve("Snapshot", "Terminology");
        File datastorePath = new File(System.getProperty("datastorePath"));
        LOG.info("datastorePath: {}", datastorePath);
        ServiceProperties.set(ServiceKeys.DATA_STORE_ROOT, datastorePath);
        PrimitiveData.selectControllerByName("Open SpinedArrayStore");
        PrimitiveData.start();
    }

    @AfterAll
    public static void stopPrimitiveData() {
        LOG.info("stopPrimitiveData");
        PrimitiveData.stop();
        LOG.info("Stopped");
    }

    @Override
    public String getDir() {
        return origin.toFile().getPath();
    }

    @Override
    public String getEdition() {
        return IntegrationTestUtils.findEditionFromOrigin(origin);
    }

    @Override
    public String getEditionDir() {
        return ""; // Not used
    }

    @Override
    public String getVersion() {
        return IntegrationTestUtils.findVersionFromOrigin(origin);
    }

    @Override
    public String getInternationalVersion() {
        return getVersion();
    }

    @Override
    public void versionDataFile() {
        assertTrue(true);
    }

    @Override
    public void versionClass() {
        assertTrue(true);
    }

}
