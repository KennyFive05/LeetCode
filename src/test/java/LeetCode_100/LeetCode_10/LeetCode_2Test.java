package LeetCode_100.LeetCode_10;

import LeetCode_100.LeetCode_10.LeetCode_2;
import LeetCode_100.LeetCode_10.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode_2 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>�Q�G�� 25, 2018</pre>
 */
public class LeetCode_2Test {

    LeetCode_2 _LeetCode_2 = new LeetCode_2();

    /**
     * Method: addTwoNumbers(ListNode l1, ListNode l2)
     */
    @Test
    public void testAddTwoNumbers() throws Exception {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode node = _LeetCode_2.addTwoNumbers(l1, l2);
        String str = "";
        while (node != null) {
            str += node.val;
            node = node.next;
        }
        assertEquals("708", str);
    }

    @Test
    public void addTwoNumbersBySort() throws Exception {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(2);
        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(5);

        ListNode node = _LeetCode_2.addTwoNumbersBySort(l1, l2);
        String str = "";
        while (node != null) {
            str += node.val;
            node = node.next;
        }
        assertEquals("807", str);
    }

} 
