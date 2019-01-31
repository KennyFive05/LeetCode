package LeetCode_100.LeetCode_30;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_26 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 31, 2019</pre>
 */
public class LeetCode_26Test {
    LeetCode_26 _LeetCode_26 = new LeetCode_26();

    /**
     * Method: removeDuplicates(int[] nums)
     */
    @Test
    public void testRemoveDuplicates() throws Exception {
        int[] nums = new int[]{1, 1, 2};
        assertEquals(2, _LeetCode_26.removeDuplicates(nums));
        Arrays.stream(nums).forEach(System.out::println);
        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, _LeetCode_26.removeDuplicates(nums));
        Arrays.stream(nums).forEach(System.out::println);
    }

} 
