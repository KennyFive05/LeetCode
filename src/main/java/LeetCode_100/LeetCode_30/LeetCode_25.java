package LeetCode_100.LeetCode_30;

import Model.ListNode;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_25 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = new ListNode(0);
        ListNode tResult = result;
        List<ListNode> list = new LinkedList<>();
        List<ListNode> list2 = new LinkedList<>();
        int count = 0;
        while (head != null) {
            list.add(head);
            head = head.next;

            count++;
            if (count == k) {
                count = 0;
                Collections.reverse(list);
                list2.addAll(list);
                list = new LinkedList<>();
            }
        }
        list2.addAll(list);
        for (ListNode node : list2) {
            tResult.next = node;
            tResult = tResult.next;
        }

        return result.next;
    }

}
