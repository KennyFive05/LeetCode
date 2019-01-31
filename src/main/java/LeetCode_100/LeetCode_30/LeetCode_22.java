package LeetCode_100.LeetCode_30;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_22 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<>();
        Character left = '(';
        Character right = ')';

        StringBuilder sb = new StringBuilder();
        // n = 2
        if (n > 0) {
            sb.append(left);
            n--;
            if(n > 0){

                sb.append(right);
            }
        }

        for (int i = 0; i < n; i++) {

        }
        return null;
    }
}
