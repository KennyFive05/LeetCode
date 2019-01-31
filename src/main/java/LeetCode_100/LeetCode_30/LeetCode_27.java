package LeetCode_100.LeetCode_30;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_27 {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new LinkedList<>();
        for (int n : nums) {
            if (n != nums[val])
                list.add(n);
        }

        return list.size();
    }
}
