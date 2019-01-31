package LeetCode_100.LeetCode_20;

import java.util.Arrays;
import java.util.Random;

public class LeetCode_14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs.length >= 2) {
            Arrays.sort(strs);
            String start = strs[0];
            String end = strs[strs.length - 1];
            for (int i = 0; i < Math.min(start.length(), end.length()); i++) {
                if (start.charAt(i) != end.charAt(i))
                    break;
                sb.append(start.charAt(i));
            }

        }
        return sb.toString();
    }
}
