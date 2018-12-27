package LeetCode_100.LeetCode_10;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_8 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�Q�G�� 27, 2018</pre>
 */
public class LeetCode_8Test {
    LeetCode_8 _LeetCode_8 = new LeetCode_8();

    /**
     * Method: reverse(int x)
     */
    @Test
    public void testReverse() throws Exception {
        assertEquals(42, _LeetCode_8.myAtoi("42"));
        assertEquals(-42, _LeetCode_8.myAtoi("   -42"));
        assertEquals(4193, _LeetCode_8.myAtoi("4193 with words"));
        assertEquals(0, _LeetCode_8.myAtoi("words and 987"));
        assertEquals(-2147483648, _LeetCode_8.myAtoi("-91283472332"));
    }

} 
