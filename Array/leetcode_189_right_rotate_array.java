import java.util.*;
public class leetcode_189_right_rotate_array {

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        Right_rotation_array(nums, 3);
        System.out.println(Arrays.toString(nums));

    }

    public static void Right_rotation_array(int[] nums, int k) {
        int n = nums.length;
        k = k & n;
        reverse_array(nums, 0, n-1);
        reverse_array(nums, 0, k - 1);
        reverse_array(nums, k, n - 1);

    }

    public static void reverse_array(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;

        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
