package LeetCode_100.LeetCode_20;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_13 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 2, 2019</pre>
 */
public class LeetCode_13Test {

    LeetCode_13 _LeetCode_13 = new LeetCode_13();

    /**
     * Method: romanToInt(String s)
     */
    @Test
    public void testRomanToInt() throws Exception {
        assertEquals(3, _LeetCode_13.romanToInt("III"));
        assertEquals(4, _LeetCode_13.romanToInt("IV"));
        assertEquals(9, _LeetCode_13.romanToInt("IX"));
        assertEquals(58, _LeetCode_13.romanToInt("LVIII"));
        assertEquals(1994, _LeetCode_13.romanToInt("MCMXCIV"));
    }

} 
