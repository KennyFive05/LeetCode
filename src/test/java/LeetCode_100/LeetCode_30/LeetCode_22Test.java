package LeetCode_100.LeetCode_30;

import LeetCode_100.LeetCode_30.LeetCode_22;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_22 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 4, 2019</pre>
 */
public class LeetCode_22Test {
    LeetCode_22 _LeetCode_22 = new LeetCode_22();

    /**
     * Method: generateParenthesis(int n)
     */
    @Test
    public void testGenerateParenthesis() throws Exception {
        List<String> list = new LinkedList<>(Arrays.asList(new String[]{"((()))", "(()())", "(())()", "()(())", "()()()"}));

        assertEquals(list, _LeetCode_22.generateParenthesis(3));
    }

} 
