package LeetCode_100.LeetCode_20;

import LeetCode_100.LeetCode_20.LeetCode_11;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_11 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�Q�G�� 28, 2018</pre>
 */
public class LeetCode_11Test {
    LeetCode_11 _LeetCode_11 = new LeetCode_11();

    /**
     * Method: maxArea(int[] height)
     */
    @Test
    public void testMaxArea() throws Exception {
        assertEquals(49, _LeetCode_11.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

} 
