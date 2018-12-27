package LeetCode_100.LeetCode_10;

public class LeetCode_7 {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)
                    || result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                result = 0;
                break;
            }
            result = result * 10 + pop;
        }

        return result;
    }
}
