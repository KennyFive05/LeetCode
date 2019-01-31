package LeetCode_100.LeetCode_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new LinkedList<>();
        Arrays.stream(nums).sorted().forEach(e -> list.add(e));

        int a = ((LinkedList<Integer>) list).getFirst();
        int c = ((LinkedList<Integer>) list).getLast();
        ((LinkedList<Integer>) list).removeFirst();
        ((LinkedList<Integer>) list).removeLast();
        while (a < 0 && c > 0) {
            int b = -a - c;
            if (list.contains(b)) {
                result.add(new ArrayList<>(Arrays.asList(new Integer[]{a, b, c})));
            }
            if (Math.abs(a) > c) {
                a = ((LinkedList<Integer>) list).getFirst();
                ((LinkedList<Integer>) list).removeFirst();
            } else {
                c = ((LinkedList<Integer>) list).getLast();
                ((LinkedList<Integer>) list).removeLast();
            }
        }

        return result;
    }
}
