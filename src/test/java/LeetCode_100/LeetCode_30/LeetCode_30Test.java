package LeetCode_100.LeetCode_30;

import LeetCode_100.LeetCode_30.LeetCode_30;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_30 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 31, 2019</pre>
 */
public class LeetCode_30Test {
    LeetCode_30 _LeetCode_30 = new LeetCode_30();

    /**
     * Method: findSubstring(String s, String[] words)
     */
    @Test
    public void testFindSubstring() {
        List<Integer> list = _LeetCode_30.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"});
        StringBuilder sb = new StringBuilder();
        for (Integer integer : list) {
            sb.append(integer).append(", ");
        }
        assertEquals("0, 9, ", sb.toString());

        list = _LeetCode_30.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"});
        sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i).append(", ");
        }
        assertEquals("", sb.toString());
    }

} 
