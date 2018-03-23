import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test1() throws Exception {
        assertEquals(new Main().test(), "test");
    }

}