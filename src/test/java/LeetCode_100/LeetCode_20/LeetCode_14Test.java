package LeetCode_100.LeetCode_20;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_14 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 2, 2019</pre>
 */
public class LeetCode_14Test {
    LeetCode_14 _LeetCode_14 = new LeetCode_14();

    /**
     * Method: longestCommonPrefix(String[] strs)
     */
    @Test
    public void testLongestCommonPrefix() throws Exception {
        assertEquals("fl", _LeetCode_14.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", _LeetCode_14.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

} 
