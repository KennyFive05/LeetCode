package LeetCode_100.LeetCode_10;

public class LeetCode_8 {
    public int myAtoi(String str) {
        str = str.trim();
        String temp = "";
        int ans = 0;
        for (Character ch : str.toCharArray()) {
            if ("+-".contains(ch.toString())) {
                temp = ch.toString();
                continue;
            }

            try {
                int i = Integer.parseInt(temp + ch);
                if (Integer.MAX_VALUE / 10 < ans || (Integer.MAX_VALUE / 10 == ans && i > 7)) {
                    ans = Integer.MAX_VALUE;
                    break;
                } else if (Integer.MIN_VALUE / 10 > ans || (Integer.MIN_VALUE / 10 == ans && i < -8)) {
                    ans = Integer.MIN_VALUE;
                    break;
                } else {
                    ans = ans * 10 + Integer.parseInt(temp + ch);
                }

            } catch (Exception e) {
                break;
            }

        }

        return ans;
    }
}
