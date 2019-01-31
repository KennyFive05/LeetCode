package LeetCode_100.LeetCode_20;

import Model.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_19 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�@�� 4, 2019</pre>
 */
public class LeetCode_19Test {

    LeetCode_19 _LeetCode_19 = new LeetCode_19();

    /**
     * Method: removeNthFromEnd(ListNode head, int n)
     */
    @Test
    public void testRemoveNthFromEnd() throws Exception {
        ListNode listNode = new ListNode(1);
        ListNode c = listNode;
        for (int i = 2; i <= 5; i++) {
            c.next = new ListNode(i);
            c = c.next;
        }

        listNode = _LeetCode_19.removeNthFromEnd(listNode, 2);
        ListNode temp = listNode;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }

        assertEquals("1235", sb.toString());
    }

} 
