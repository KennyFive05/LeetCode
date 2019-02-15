package LeetCode_100.LeetCode_40;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_34 {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> list = new LinkedList<>();
        Arrays.stream(nums).forEach(list::add);
        return new int[]{list.indexOf(target), list.lastIndexOf(target)};
    }
}
