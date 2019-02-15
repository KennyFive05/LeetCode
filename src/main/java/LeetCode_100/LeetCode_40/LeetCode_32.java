package LeetCode_100.LeetCode_40;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_32 {
    public int longestValidParentheses(String s) {
        List<Integer> list = new LinkedList<>();
        int maxLength = 0, length = 0, push = 0;
        for (int i = s.indexOf('('); i < s.length(); i++) {
            push++;
            switch (s.charAt(i)) {
                case '(':
                    list.add(i);
                    break;
                case ')':
                    if (list.size() > 0) {
                        length = i - ((LinkedList<Integer>) list).pollLast() + 1;
                        if (length > maxLength)
                            maxLength = length;
                    } else if (list.size() == 0) {
                        if (push - 1 > maxLength)
                            maxLength = push - 1;
                        push = 0;
                    }
                    break;
            }
        }
        if (push - 1 > maxLength)
            maxLength = push - 1;

        return maxLength;
    }
}
