public class Leetcode_209_Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        System.out.println(Min_subarray_len(nums, 7));

    }

    public static int Min_subarray_len(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int Min_len = Integer.MAX_VALUE;
        int sum = 0;

        while (r < n) {
            sum += nums[r];
            while (sum >= target) {
                Min_len = Math.min(r - l + 1, Min_len);
                sum -= nums[l];
                l++;
            }
            r++;

        }
        return Min_len;
    }
}
