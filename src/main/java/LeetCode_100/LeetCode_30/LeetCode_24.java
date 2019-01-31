package LeetCode_100.LeetCode_30;

import Model.ListNode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_24 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode(0);

        List<ListNode> list = new LinkedList<>();

        ListNode tRestlt = result;
        ListNode temp = null;
        boolean flag = true;
        while (head != null) {
            if (flag) {
                temp = head;
            } else {
                list.add(head);
                list.add(temp);
                temp = null;
            }
            flag = !flag;
            head = head.next;
        }
        if (temp != null) {
            list.add(temp);
        }
        for (ListNode node : list) {
            tRestlt.next = node;
            tRestlt = tRestlt.next;
        }
        tRestlt.next = null;

        return result.next;
    }

}
