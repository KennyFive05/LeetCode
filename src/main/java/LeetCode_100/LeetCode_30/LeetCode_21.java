package LeetCode_100.LeetCode_30;

import Model.ListNode;

public class LeetCode_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result;
        boolean fleg = false;
        if (l1 != null) {
            result = new ListNode(l1.val);
            l1 = l1.next;
        } else if (l2 != null) {
            result = new ListNode(l2.val);
            fleg = true;
            l2 = l2.next;
        }else{
            result = null;
        }
        ListNode temp = result;
        while (l1 != null || l2 != null) {
            if (fleg) {
                if (l1 != null) {
                    temp.next = new ListNode(l1.val);
                    l1 = l1.next;
                    temp = temp.next;
                }
            } else {
                if (l2 != null) {
                    temp.next = new ListNode(l2.val);
                    l2 = l2.next;
                    temp = temp.next;
                }
            }
            fleg = !fleg;
        }

        return result;
    }
}
