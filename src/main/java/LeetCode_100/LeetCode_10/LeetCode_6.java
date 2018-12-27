package LeetCode_100.LeetCode_10;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_6 {
    public static void main(String[] args) {
        String[] array = new String[4];
        System.out.println(array[0]);
        array[0] = array[0] != null ? array[0] + 'a' : "a";
        System.out.println(array[0]);
    }

    public String convert(String s, int numRows) {
        StringBuilder result = new StringBuilder();
        List<StringBuilder> list = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int row = 0;
        boolean isUp = true;
        for (Character ch : s.toCharArray()) {
            list.get(row).append(ch);
            row += isUp ? 1 : -1;
            if (row == numRows - 1 || row == 0)
                isUp = !isUp;
        }
        for (StringBuilder sb : list) {
            result.append(sb);
        }
        return result.toString();
    }
}
