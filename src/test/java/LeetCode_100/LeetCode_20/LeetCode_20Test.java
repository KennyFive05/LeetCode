package LeetCode_100.LeetCode_20;

import LeetCode_100.LeetCode_20.LeetCode_20;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_20 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 4, 2019</pre>
 */
public class LeetCode_20Test {
    LeetCode_20 _LeetCode_20 = new LeetCode_20();

    /**
     * Method: isValid(String s)
     */
    @Test
    public void testIsValid() throws Exception {
        assertEquals(true, _LeetCode_20.isValid("(afg)"));
        assertEquals(true, _LeetCode_20.isValid("()[]{}"));
        assertEquals(false, _LeetCode_20.isValid("(]"));
        assertEquals(false, _LeetCode_20.isValid("([)]"));
        assertEquals(true, _LeetCode_20.isValid("{[]}"));
    }

} 
