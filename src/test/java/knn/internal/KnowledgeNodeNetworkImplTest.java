package knn.internal;

import knn.api.KnowledgeNodeNetwork;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by seanstappas1 on 2017-10-13.
 */
public class KnowledgeNodeNetworkImplTest {
    private KnowledgeNodeNetwork knn;

    @BeforeMethod
    public void setUp() throws Exception {
        knn = new KnowledgeNodeNetworkImpl();
    }

    @Test
    public void testReset() throws Exception {
    }

    @Test
    public void testResetEmpty() throws Exception {
    }

    @Test
    public void testSaveKNN() throws Exception {
    }

    @Test
    public void testClearKN() throws Exception {
    }

    @Test
    public void testAddKN() throws Exception {
    }

    @Test
    public void testDelKN() throws Exception {
    }

    @Test
    public void testAddFiredTag() throws Exception {
    }

    @Test
    public void testGetInputTags() throws Exception {
    }

    @Test
    public void testGetActiveTags() throws Exception {
    }

    @Test
    public void testLambdaSearch() throws Exception {
    }

    @Test
    public void testBackwardSearch() throws Exception {
    }

    @Test
    public void testGetInputForBackwardSearch() throws Exception {
    }

    @Test
    public void testBackwardSearch1() throws Exception {
    }

    @Test
    public void testForwardSearch() throws Exception {
    }

    @Test
    public void testForwardSearch1() throws Exception {
    }

    @Test
    public void testGetInputForForwardSearch() throws Exception {
    }

    @Test
    public void testCreateKNfromTuple() throws Exception {
    }

    @Test
    public void testExcite() throws Exception {
    }

    @Test
    public void testFire() throws Exception {
    }

    @Test
    public void testUpdateConfidence() throws Exception {
    }

}