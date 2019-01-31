package LeetCode_100.LeetCode_20;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums.length < 4) {
            return result;
        }

        List<Integer> list = new LinkedList<>();
        Arrays.stream(nums).sorted().forEach(e -> list.add(e));

        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            if (a > target)
                break;
            for (int j = i + 1; j < list.size(); j++) {
                int b = list.get(j);
                if (a + b > target)
                    break;
                for (int k = j + 1; k < list.size(); k++) {
                    int c = list.get(k);
                    if (a + b + c > target)
                        break;
                    if (list.lastIndexOf(target - a - b - c) > k) {
                        result.add(new LinkedList<>(Arrays.asList(new Integer[]{a, b, c, target - a - b - c})));
                    }
                }
            }
        }

        return result;
    }
}
