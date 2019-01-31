package LeetCode_100.LeetCode_30;

import LeetCode_100.LeetCode_30.LeetCode_25;
import Model.ListNode;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_25 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 31, 2019</pre>
 */
public class LeetCode_25Test {
    LeetCode_25 _LeetCode_25 = new LeetCode_25();

    /**
     * Method: reverseKGroup(ListNode head, int k)
     */
    @Test
    public void testReverseKGroup() throws Exception {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        ListNode ans = _LeetCode_25.reverseKGroup(listNode, 2);
        StringBuilder sb = new StringBuilder();
        while (ans != null) {
            sb.append(ans.val);
            ans = ans.next;
        }

        assertEquals("21435", sb.toString());
    }

    @Test
    public void testReverseKGroup2() throws Exception {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        ListNode ans = _LeetCode_25.reverseKGroup(listNode, 3);
        StringBuilder sb = new StringBuilder();
        while (ans != null) {
            sb.append(ans.val);
            ans = ans.next;
        }

        assertEquals("32145", sb.toString());
    }

} 
