package LeetCode_100.LeetCode_30;

import Model.ListNode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_23 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode(0);
        ListNode temp;
        List<Integer> list = new LinkedList<>();

        for (ListNode listNode : lists) {
            temp = listNode;
            while (temp != null) {
                list.add(temp.val);
                temp = temp.next;
            }
        }
        list.sort(Integer::compareTo);
        temp = result;
        for (Integer i : list) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        result = result.next;

        return result;
    }

}
