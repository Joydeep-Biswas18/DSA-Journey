

public class Leetcode_485_MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] nums = {1,1,1,1,1,1,1,1,1,0,0,0,1,0,1,0,1,0,1,1,0,1,0};
        System.out.println(max_consecutive_one(nums));
        
    }
    public static int max_consecutive_one(int[] nums){
        int max_one =0;
        int count =0;

        //outer loop
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max_one = Math.max(count, max_one);

            }
            else{
                count =0;
            }

        }
        return max_one;
    }
}

