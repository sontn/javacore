package DSA;

public class FindMinimumRotatedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {

        FindMinimumRotatedArray obj = new FindMinimumRotatedArray();
        int[] nums = {4, 5, 6, 7, 1, 2, 3};
        System.out.println(obj.findMin(nums)); // Output: 1

    }
}
