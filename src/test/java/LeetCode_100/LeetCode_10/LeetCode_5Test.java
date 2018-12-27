package LeetCode_100.LeetCode_10;

import LeetCode_100.LeetCode_10.LeetCode_5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_5 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�Q�G�� 26, 2018</pre>
 */
public class LeetCode_5Test {
    LeetCode_5 _LeetCode_5 = new LeetCode_5();

    /**
     * Method: longestPalindrome(String s)
     */
    @Test
    public void testLongestPalindrome() throws Exception {
        assertEquals("bab", _LeetCode_5.longestPalindrome("babad"));
        assertEquals("bb", _LeetCode_5.longestPalindrome("cbbd"));
        assertEquals("ababa", _LeetCode_5.longestPalindrome("ababadec"));
    }

} 
