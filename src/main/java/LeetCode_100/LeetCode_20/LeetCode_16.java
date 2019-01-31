package LeetCode_100.LeetCode_20;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_16 {
    public int threeSumClosest(int[] nums, int target) {
        List<Integer> list = new LinkedList<>();
        Arrays.stream(nums).sorted().forEach(e -> list.add(e));
        int a = 0;
        int b = list.size() / 2;
        int c = list.size() - 1;
        int min = c, sum = c;
        while (a <= b && b <= c) {
            if (a != b && b != c) {
                sum = list.get(a) + list.get(b) + list.get(c);
                if (Math.abs(sum - target) < Math.abs(min - target)) {
                    min = sum;
                }
                if (min == target)
                    break;
            }
            if (sum > target) {
                if (c == b)
                    b--;
                else
                    c--;
            } else {
                if (a == b)
                    b++;
                else
                    a++;
            }
        }

        return min;
    }
}
