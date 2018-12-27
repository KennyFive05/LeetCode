package LeetCode_100.LeetCode_10;

import org.apache.commons.lang3.StringUtils;

public class LeetCode_5 {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            len = Math.max(len, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
