package LeetCode_100.LeetCode_20;

import LeetCode_100.LeetCode_20.LeetCode_16;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_16 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 3, 2019</pre>
 */
public class LeetCode_16Test {
    LeetCode_16 _LeetCode_16 = new LeetCode_16();

    /**
     * Method: threeSumClosest(int[] nums, int target)
     */
    @Test
    public void testThreeSumClosest() throws Exception {
        assertEquals(2, _LeetCode_16.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }

} 
