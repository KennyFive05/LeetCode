package LeetCode_100.LeetCode_20;

import Model.ListNode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        List<ListNode> list = new LinkedList<>();
        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        if (list.size() <= n) {
            head = null;
        } else if (n == 1) {
            list.get(list.size() - n - 1).next = null;
        } else {
            list.get(list.size() - n - 1).next = list.get(list.size() - n + 1);
        }

        return head;
    }

}

