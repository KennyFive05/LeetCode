package LeetCode_100.LeetCode_20;

public class LeetCode_13 {
    public int romanToInt(String s) {
        /*
         * 字符          数值
         * I             1
         * V             5
         * X             10
         * L             50
         * C             100
         * D             500
         * M             1000
         */
        int result = 0;
        int[] vals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < romans.length; i++) {
            while (s.startsWith(romans[i])) {
                result += vals[i];
                s = s.substring(romans[i].length());
            }
        }

        return result;
    }
}
