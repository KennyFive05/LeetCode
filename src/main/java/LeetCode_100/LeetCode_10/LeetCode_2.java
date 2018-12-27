package LeetCode_100.LeetCode_10;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class LeetCode_2 {

    public static void main(String[] args) {
        LeetCode_2 code = new LeetCode_2();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode node = code.addTwoNumbers(l1, l2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode curr = result;
        int add = 0, sum;
        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            sum = x + y + add;
            add = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            l1 = l1.next;
            l2 = l2.next;
        }
        if (add > 0) {
            result.next = new ListNode(add);
        }

        return result.next;
    }

    /**
     * 如果链表中的数字不是按逆序存储的呢？例如：
     * <p>
     * (3 > 4 > 2) + (4 > 6 > 5) = 8 > 0 > 7
     * (3→4→2)+(4→6→5)=8→0→7
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbersBySort(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode curr = result;
        int x = 0, y = 0, sum;
        while (l1 != null) {
            x = x * 10 + l1.val;
            l1 = l1.next;
        }
        while (l2 != null) {
            y = y * 10 + l2.val;
            l2 = l2.next;
        }
        sum = x + y;
        String str = String.valueOf(sum);
        for (int i = 0; i < str.length(); i++) {
            curr.next = new ListNode(Integer.valueOf(str.substring(i, i + 1)));
            curr = curr.next;
        }

        return result.next;
    }
}

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
