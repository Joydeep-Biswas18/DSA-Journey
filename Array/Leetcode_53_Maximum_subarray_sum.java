public class Leetcode_53_Maximum_subarray_sum {
    public static void main(String[] args) {
        int[] nums = {-1};
        int result = Max_subarray_optimal_kadane_algorithm(nums);
        System.out.println(result);

        
    }
    public static int maxSubArray(int[] nums) {
        int max_sum =Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            int sum =0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];

                max_sum = Math.max(sum,max_sum);


            }
        }
        return max_sum;
   
    }
    public static int Max_subarray_optimal_kadane_algorithm(int[] nums){
        int max_sum = Integer.MIN_VALUE;
        int sum =0;
        int i =0;
        while(i<nums.length){
            sum += nums[i];
            max_sum = Math.max(max_sum, sum);
            if(sum<0){
                sum =0;
            }
            
            i++;
        }
        return max_sum;
    }
}

