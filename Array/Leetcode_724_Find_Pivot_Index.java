public class Leetcode_724_Find_Pivot_Index {
    public static void main(String[] args) {
        int[] nums = { 2,1,-1 };
        System.out.println(Find_pivot(nums));

    }

    public static int Find_pivot(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int TotalSum = 0;

        for (int num : nums) {
            TotalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = TotalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;

    }
}
