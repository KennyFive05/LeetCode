package LeetCode_100.LeetCode_20;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_15 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 3, 2019</pre>
 */
public class LeetCode_15Test {
    LeetCode_15 _LeetCode_15 = new LeetCode_15();

    /**
     * Method: threeSum(int[] nums)
     */
    @Test
    public void testThreeSum() throws Exception {
        List<List> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(Arrays.asList(new Integer[]{-1, 0, 1}));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(new Integer[]{-1, -1, 2}));
        list.add(list2);
        list.add(list1);
        assertEquals(list, _LeetCode_15.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

} 
