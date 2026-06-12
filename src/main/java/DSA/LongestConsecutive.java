package DSA;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        int maxLength = 0;

        for(int num : nums) {
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;

    }
    public static void main(String[] args) {
        LongestConsecutive obj = new LongestConsecutive();
        int[] nums = {5, 5, 100, 4, 200, 1, 3, 2, 4};

        System.out.println(obj.longestConsecutive(nums));
    }
}
