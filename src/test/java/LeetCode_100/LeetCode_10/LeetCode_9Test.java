package LeetCode_100.LeetCode_10;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_9 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�Q�G�� 28, 2018</pre>
 */
public class LeetCode_9Test {
    LeetCode_9 _LeetCode_9 = new LeetCode_9();

    /**
     * Method: isPalindrome(int x)
     */
    @Test
    public void testIsPalindrome() throws Exception {
        assertEquals(true, _LeetCode_9.isPalindrome(121));
        assertEquals(false, _LeetCode_9.isPalindrome(-123));
        assertEquals(false, _LeetCode_9.isPalindrome(10));
    }

} 
