package LeetCode_100.LeetCode_30;

import LeetCode_100.LeetCode_30.LeetCode_27;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_27 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 31, 2019</pre>
 */
public class LeetCode_27Test {
    LeetCode_27 _LeetCode_27 = new LeetCode_27();

    /**
     * Method: removeElement(int[] nums, int val)
     */
    @Test
    public void testRemoveElement() {
        int[] nums = new int[]{3, 2, 2, 3};
        assertEquals(2, _LeetCode_27.removeElement(nums, 2));
        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        assertEquals(5, _LeetCode_27.removeElement(nums, 2));
    }

} 
