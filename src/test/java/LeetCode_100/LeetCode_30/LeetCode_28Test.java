package LeetCode_100.LeetCode_30;

import LeetCode_100.LeetCode_30.LeetCode_28;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_28 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 31, 2019</pre>
 */
public class LeetCode_28Test {
    LeetCode_28 _LeetCode_28 = new LeetCode_28();

    /**
     * Method: strStr(String haystack, String needle)
     */
    @Test
    public void testStrStr() throws Exception {
        assertEquals(2, _LeetCode_28.strStr("hello", "ll"));
        assertEquals(-1, _LeetCode_28.strStr("aaaaa", "bba"));
    }

} 
