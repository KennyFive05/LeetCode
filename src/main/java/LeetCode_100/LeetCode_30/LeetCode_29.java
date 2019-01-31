package LeetCode_100.LeetCode_30;

public class LeetCode_29 {
    public int divide(int dividend, int divisor) {
        if (divisor == 0)
            return 0;

        int result = 0;
        if (dividend > 0 && divisor > 0 ||
                dividend < 0 && divisor < 0) {
            while (Math.abs(dividend) > Math.abs(divisor)) {
                dividend = Math.abs(dividend) - Math.abs(divisor);
                result++;
            }
        } else {
            while (Math.abs(dividend) > Math.abs(divisor)) {
                dividend = Math.abs(dividend) - Math.abs(divisor);
                result--;
            }
        }

        return result;
    }
}
