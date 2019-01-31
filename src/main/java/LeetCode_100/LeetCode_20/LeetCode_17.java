package LeetCode_100.LeetCode_20;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_17 {

    public List<String> letterCombinations(String digits) {
        List<String> result = new LinkedList<>();
        addStr(result, digits, "");
        return result;
    }

    private List<String> addStr(List<String> list, String str, String sb) {
        String[] phoneStr = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        Character ch = str.charAt(0);
        int num = Integer.parseInt(ch.toString());
        for (int i = 0; i < phoneStr[num].length(); i++) {
            if (str.length() == 1) {
                list.add(sb + phoneStr[num].charAt(i));
            } else {
                list = addStr(list, str.substring(1), sb + phoneStr[num].charAt(i));
            }
        }
        return list;
    }
}
