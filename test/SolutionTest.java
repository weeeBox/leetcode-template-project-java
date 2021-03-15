import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test0() {
        assertEquals(3, new Solution().sum(1, 2));
    }

    @Test
    public void test1() {
        assertEquals(0, new Solution().sum(-1, 1));
    }
}