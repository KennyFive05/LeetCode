package LeetCode_100.LeetCode_10;

import LeetCode_100.LeetCode_10.LeetCode_4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_4 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�Q�G�� 26, 2018</pre>
 */
public class LeetCode_4Test {
    LeetCode_4 _LeetCode_4 = new LeetCode_4();

    /**
     * Method: findMedianSortedArrays(int[] nums1, int[] nums2)
     */
    @Test
    public void testFindMedianSortedArrays() throws Exception {
        assertEquals(2.0, _LeetCode_4.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0.01);
        assertEquals(2.5, _LeetCode_4.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 0.01);
    }

    @Test
    public void testFindMedianSortedArrays2() throws Exception {
        assertEquals(2.0, _LeetCode_4.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0.01);
        assertEquals(2.5, _LeetCode_4.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 0.01);
    }

} 
