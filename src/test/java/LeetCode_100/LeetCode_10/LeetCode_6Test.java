package LeetCode_100.LeetCode_10;

import LeetCode_100.LeetCode_10.LeetCode_6;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_6 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�Q�G�� 26, 2018</pre>
 */
public class LeetCode_6Test {
    LeetCode_6 _LeetCode_6 = new LeetCode_6();

    /**
     * Method: convert(String s, int numRows)
     */
    @Test
    public void testConvert() throws Exception {
        assertEquals("LCIRETOESIIGEDHN", _LeetCode_6.convert("LEETCODEISHIRING", 3));
        assertEquals("LDREOEIIECIHNTSG", _LeetCode_6.convert("LEETCODEISHIRING", 4));
        assertEquals("LIEESGEDHNTOIICR", _LeetCode_6.convert("LEETCODEISHIRING", 5));
    }
} 
