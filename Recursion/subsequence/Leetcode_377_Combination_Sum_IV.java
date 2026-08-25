

import java.util.Arrays;

public class Leetcode_377_Combination_Sum_IV {
    public static void main(String[] args) {
        
    }
    public int combinationSum4(int[] nums, int target) {
        //Creating a dp table
        int[] dp = new int[target + 1];

        //Initialize dp table by -1 value
        Arrays.fill(dp, -1);

        return combinationSum4(nums, target, dp);
    }

    public int combinationSum4(int[] nums, int target, int[] dp) {

        // Base case
        if (target == 0) {
            return 1;
        }

        // Target became negative 
        if (target < 0) {
            return 0;
        }

        // Already calculated
        // if dp[target] -1 na hoi atr mane ota age thake calculate kore ache
        if (dp[target] != -1) {
            return dp[target];
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            count += combinationSum4(nums, target - nums[i], dp);
        }

        // Store result like target 3 and 2 and 1 and 0 beacause we don't need to calculate these all further repeatedly
        dp[target] = count;

        return dp[target];
    }
}
    

