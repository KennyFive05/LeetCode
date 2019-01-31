package LeetCode_100.LeetCode_30;

import LeetCode_100.LeetCode_30.LeetCode_24;
import Model.ListNode;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_24 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 31, 2019</pre>
 */
public class LeetCode_24Test {

    LeetCode_24 _LeetCode_24 = new LeetCode_24();

    /**
     * Method: swapPairs(ListNode head)
     */
    @Test
    public void testSwapPairs() throws Exception {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);

        ListNode ans = _LeetCode_24.swapPairs(listNode);
        StringBuilder sb = new StringBuilder();
        while (ans != null) {
            sb.append(ans.val);
            ans = ans.next;
        }

        assertEquals("2143", sb.toString());
    }

} 
