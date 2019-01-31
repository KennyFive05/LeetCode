package LeetCode_100.LeetCode_30;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new LinkedList<>();
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength)
                maxLength = word.length();
        }
        for (int i = 0; i < s.length(); i++) {
            List<String> wordList = new LinkedList<>();
            Arrays.stream(words).forEach(word -> wordList.add(word));
            int left = i, right = left + 1;
            String temp = "";
            while (temp.length() <= maxLength && right < s.length()) {
                temp = s.substring(left, right);
                if (wordList.contains(temp)) {
                    wordList.remove(temp);
                    left += temp.length();
                    right = left + 1;
                } else {
                    right++;
                }
                if (wordList.size() == 0) {
                    list.add(i);
                    break;
                }
            }
        }
        list.sort(Integer::compareTo);

        return list;
    }
}
