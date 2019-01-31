package LeetCode_100.LeetCode_20;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_20 {
    public boolean isValid(String s) {
        boolean result = true;
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        int left = 0, right;
        while (result && left < s.length()) {
            if (map.containsValue(s.charAt(left))) { // 無左括號有右括號
                return false;
            }
            if (!map.containsKey(s.charAt(left))) { // 非括號
                left++;
                continue;
            }
            right = s.indexOf(map.get(s.charAt(left)), left);
            if (right < 0) { // 找不到對應的
                return false;
            } else {
                result = isValid(s.substring(left + 1, right));
            }
            left = right + 1;
        }

        return result;
    }
}
