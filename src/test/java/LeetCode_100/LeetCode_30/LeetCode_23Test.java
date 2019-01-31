package LeetCode_100.LeetCode_30;

import Model.ListNode;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_23 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 30, 2019</pre>
 */
public class LeetCode_23Test {

    LeetCode_23 _LeetCode_23 = new LeetCode_23();

    /**
     * Method: mergeKLists(ListNode[] lists)
     */
    @Test
    public void testMergeKLists() throws Exception {
        ListNode[] listNode = new ListNode[3];
        listNode[0] = new ListNode(1);
        listNode[0].next = new ListNode(4);
        listNode[0].next.next = new ListNode(5);

        listNode[1] = new ListNode(1);
        listNode[1].next = new ListNode(3);
        listNode[1].next.next = new ListNode(4);

        listNode[2] = new ListNode(2);
        listNode[2].next = new ListNode(6);

        ListNode ans = _LeetCode_23.mergeKLists(listNode);
        StringBuilder sb = new StringBuilder();
        while (ans != null) {
            sb.append(ans.val);
            ans = ans.next;
        }

        assertEquals("11234456", sb.toString());
    }

} 
