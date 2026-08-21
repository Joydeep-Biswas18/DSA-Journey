import java.util.HashMap;

public class Leetcode_560_Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        
    }class Solution {
    public int subarraySum(int[] nums, int k) {
        //This Approach is not Applicable for Negative value
        //     return No_Subarray(nums,k) - No_Subarray(nums ,k-1);

        // }

        // public static int No_Subarray(int [] nums, int k){
        //     int l=0;
        //     int r =0;

        //     int sum =0;
        //     int count=0;
        //     if (k < 0) return 0;

        //     while(r<nums.length){
        //         if(nums.length == 1){

        //         }
        //         sum +=nums[r];
        //         while(sum>k){
        //             sum -=nums[l];
        //             l++;
        //         }
        //         count += (r-l+1);

        //         r++;
        //     }
        //     return count;

        // }

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int count = 0;

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            // Check if there exists a previous prefix sum
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

}
}
