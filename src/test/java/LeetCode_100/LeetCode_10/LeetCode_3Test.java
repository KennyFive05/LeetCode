package LeetCode_100.LeetCode_10;

import LeetCode_100.LeetCode_10.LeetCode_3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_3 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�Q�G�� 26, 2018</pre>
 */
public class LeetCode_3Test {
    LeetCode_3 _LeetCode_3 = new LeetCode_3();

    /**
     * Method: lengthOfLongestSubstring(String s)
     */
    @Test
    public void testLengthOfLongestSubstring() throws Exception {
        assertEquals(3, _LeetCode_3.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, _LeetCode_3.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, _LeetCode_3.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void testLengthOfLongestSubstring2() throws Exception {
        assertEquals(3, _LeetCode_3.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, _LeetCode_3.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, _LeetCode_3.lengthOfLongestSubstring("pwwkew"));
    }
} 
