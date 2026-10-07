public class Leetcode410_Split_Array_Largest_Sum {
    public static void main(String[] args) {

    }

    public static int Min_value_of_max_Subarray(int[] nums ,int k) {
        int low =0;
        int high =0;

        for(int num : nums){
            low = Math.max(num , low);
            high += num;

        }
        int answer = high;
        while(low < high){
            int mid = low +(high - low)/2;
            if(valid_split(nums, k, mid)){
                answer = mid;
                high = mid -1;
            }
            else{
                low = mid+1;
            }

        }
        return answer;

    }

    public static boolean valid_split(int[] nums,int k, int max_valid) {

        int currSum = 0;
        int No_Subarray = 1;

        for (int num : nums) {
            if (currSum + num > max_valid) {
                No_Subarray++;
                currSum = num;

                if (No_Subarray > k) {
                    return false;
                }

            } else {
                currSum += num;
            }
        }
        return No_Subarray<=k;

    }
}
