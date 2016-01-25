import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by admin228 on 25.01.2016.
 */
public class TestTestPr {

    TestPr tp;

    @Before
    public void InitPr() {
        tp = new TestPr(1,2,3);
    }

    @Test
    public void TestingPr() {
        assertEquals("Testing mult error", 6, tp.mult());
    }

    @Test
    public void TestingPr2() {
        tp.setK(3);
        assertEquals("Testing mult error", 18, tp.mult());
    }

}
