
public class Leetcode_1423_Maximum_Points_You_Can_Obtain_from_Cards {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        System.out.println(max_score(nums, k));

        //Most Optimal Approach 
        Solution_Most_optimal onbj = new Solution_Most_optimal();
        System.out.println(onbj.Max_score(nums, k));

    }

    public static int max_score(int[] nums, int k) {
        int n = nums.length;
        int total_sum = 0;
        for (int i = 0; i < n; i++) {
            total_sum += nums[i];
        }
        int Sum_min_subarray = Min_sum(nums, k);

        return total_sum - Sum_min_subarray;

        

    }

    //Find out the minimum Sum Subarray with N-k length
    public static int Min_sum(int[] nums, int k) {
        int n = nums.length;
        int Min_sum = Integer.MAX_VALUE;
        int sum = 0;
        int l = 0;
        int r = 0;
        while (r < nums.length) {
            sum += nums[r];
            if ((r - l + 1) > (n - k)) {
                sum -= nums[l];
                l++;

            }
            // Check only windows of exactly n-k elements
            if ((r - l + 1) == (n - k)) {
                Min_sum = Math.min(Min_sum, sum);
            }
            r++;
        }

        return Min_sum;
    }

}
//In the question that is given that we should take from either left and right 

class Solution_Most_optimal {

    public static int Max_score(int[] nums, int k) {
        int n = nums.length;
        int left_sum = 0;
        int max_sum = 0;
        for (int i = 0; i <= k - 1; i++) {
            left_sum += nums[i];
            max_sum = Math.max(max_sum, left_sum);
        }
        int total = max_sum;
        for (int j = k - 1; j >= 0; j--) {
            max_sum -= nums[k - 1 - j];
            max_sum += nums[n - 1 - j];

        }
        max_sum = Math.max(max_sum, total);

        return max_sum;

    }
}
