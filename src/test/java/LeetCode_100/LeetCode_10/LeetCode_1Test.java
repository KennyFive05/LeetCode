package LeetCode_100.LeetCode_10;

import LeetCode_100.LeetCode_10.LeetCode_1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_1 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�Q�G�� 25, 2018</pre>
 */
public class LeetCode_1Test {
    LeetCode_1 _LeetCode_1 = new LeetCode_1();

    /**
     * Method: twoSum(int[] nums, int target)
     */
    @Test
    public void testTwoSum() {
        int[] result = {1, 3};
        int[] result2 = _LeetCode_1.twoSum(new int[]{2, 7, 11, 15}, 22);
        assertEquals(result.length, result2.length);
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], result2[i]);
        }
    }

} 
