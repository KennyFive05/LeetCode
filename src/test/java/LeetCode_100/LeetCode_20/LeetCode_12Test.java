package LeetCode_100.LeetCode_20;

import LeetCode_100.LeetCode_20.LeetCode_11;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_12 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�Q�G�� 28, 2018</pre>
 */
public class LeetCode_12Test {
    LeetCode_12 _LeetCode_12 = new LeetCode_12();

    /**
     * Method: intToRoman(int num)
     */
    @Test
    public void testIntToRoman() throws Exception {
        assertEquals("III", _LeetCode_12.intToRoman(3));
        assertEquals("IV", _LeetCode_12.intToRoman(4));
        assertEquals("IX", _LeetCode_12.intToRoman(9));
        assertEquals("LVIII", _LeetCode_12.intToRoman(58));
        assertEquals("MCMXCIV", _LeetCode_12.intToRoman(1994));
    }

} 
