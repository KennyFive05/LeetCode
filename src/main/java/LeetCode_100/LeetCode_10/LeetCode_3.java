package LeetCode_100.LeetCode_10;

public class LeetCode_3 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            str = str.substring(str.indexOf(ch) + 1) + ch;
            max = Math.max(str.length(), max);
        }
        return max;
    }

    /**
     * 官方解
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
