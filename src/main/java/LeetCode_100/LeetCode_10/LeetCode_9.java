package LeetCode_100.LeetCode_10;

public class LeetCode_9 {
    public boolean isPalindrome(int x) {
        int revertedNumber = 0;
        while (x > revertedNumber && x >= 10) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return revertedNumber == x || revertedNumber / 10 == x;
    }
}
