package DSA;

import java.util.HashSet;
import java.util.Set;

public class Unit1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4 };
        System.out.println(hasDuplicate(nums));
    }
    public static  boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums ) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
