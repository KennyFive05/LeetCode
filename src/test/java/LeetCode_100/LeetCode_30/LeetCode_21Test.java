package LeetCode_100.LeetCode_30;

import Model.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_21 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 4, 2019</pre>
 */
public class LeetCode_21Test {
    LeetCode_21 _LeetCode_21 = new LeetCode_21();

    /**
     * Method: mergeTwoLists(ListNode l1, ListNode l2)
     */
    @Test
    public void testMergeTwoLists() throws Exception {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(4);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);

        ListNode ans = _LeetCode_21.mergeTwoLists(listNode, listNode2);
        StringBuilder sb = new StringBuilder();
        while (ans != null) {
            sb.append(ans.val);
            ans = ans.next;
        }

        assertEquals("112344", sb.toString());
    }

} 
