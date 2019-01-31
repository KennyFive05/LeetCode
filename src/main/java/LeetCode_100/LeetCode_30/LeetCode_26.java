package LeetCode_100.LeetCode_30;

import java.util.*;

public class LeetCode_26 {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (!list.contains(temp)) {
                list.add(temp);
            }
        }

        return list.size();
    }
}
