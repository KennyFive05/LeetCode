package LeetCode_100.LeetCode_20;

import LeetCode_100.LeetCode_20.LeetCode_18;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_18 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 3, 2019</pre>
 */
public class LeetCode_18Test {
    LeetCode_18 _LeetCode_18 = new LeetCode_18();

    /**
     * Method: fourSum(int[] nums, int target)
     */
    @Test
    public void testFourSum() throws Exception {
        List<List> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(Arrays.asList(new Integer[]{-1, 0, 0, 1}));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(new Integer[]{-2, -1, 1, 2}));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(new Integer[]{-2, 0, 0, 2}));
        list.add(list2);
        list.add(list3);
        list.add(list1);
        assertEquals(list, _LeetCode_18.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }

} 
