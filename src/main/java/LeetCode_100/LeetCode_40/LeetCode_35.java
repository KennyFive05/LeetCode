package LeetCode_100.LeetCode_40;

public class LeetCode_35 {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length && target > nums[i]) {
            i++;
        }

        return i;
    }
}

