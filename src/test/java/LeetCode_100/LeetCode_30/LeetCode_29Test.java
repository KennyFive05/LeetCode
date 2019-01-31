package LeetCode_100.LeetCode_30;

import LeetCode_100.LeetCode_30.LeetCode_29;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_29 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 31, 2019</pre>
 */
public class LeetCode_29Test {
    LeetCode_29 _LeetCode_29 = new LeetCode_29();

    /**
     * Method: divide(int dividend, int divisor)
     */
    @Test
    public void testDivide() throws Exception {
        assertEquals(3, _LeetCode_29.divide(10, 3));
        assertEquals(-2, _LeetCode_29.divide(7, -3));
    }

} 
