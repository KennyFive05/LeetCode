package LeetCode_100.LeetCode_10;

import LeetCode_100.LeetCode_10.LeetCode_10;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_10 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�Q�G�� 28, 2018</pre>
 */
public class LeetCode_10Test {
    LeetCode_10 _LeetCode_10 = new LeetCode_10();

    /**
     * Method: isMatch(String s, String p)
     */
    @Test
    public void testIsMatch() throws Exception {
        assertEquals(false, _LeetCode_10.isMatch("aa", "a"));
        assertEquals(true, _LeetCode_10.isMatch("aa", "a*"));
        assertEquals(true, _LeetCode_10.isMatch("ab", ".*"));
        assertEquals(true, _LeetCode_10.isMatch("aab", "c*a*b"));
        assertEquals(false, _LeetCode_10.isMatch("mississippi", "mis*is*p*."));
    }

} 
