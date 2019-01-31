package LeetCode_100.LeetCode_20;

import LeetCode_100.LeetCode_20.LeetCode_17;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_17 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 3, 2019</pre>
 */
public class LeetCode_17Test {
    LeetCode_17 _LeetCode_17 = new LeetCode_17();

    /**
     * Method: letterCombinations(String digits)
     */
    @Test
    public void testLetterCombinations() throws Exception {
        assertEquals(new LinkedList<>(Arrays.asList(new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"})), _LeetCode_17.letterCombinations("23"));
    }

} 
