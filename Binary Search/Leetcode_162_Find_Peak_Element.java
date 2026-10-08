public class Leetcode_162_Find_Peak_Element {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4,5,6,7,8,5,1};
        System.out.println(findPeakElement(nums));
        
    }
    public static int findPeakElement(int [] nums){
        int n = nums.length;
        if(n==1){
            return 0;
        }
        else if (nums[0] > nums[1]){
            return 1;

        }
        else if (nums[n-1]> nums[n-2]){
            return n-1;
        }
        else{
            int low = 1;
            int high = n-2;
            while(low<= high){
                int mid = low +(high -low)/2;
                if(nums[mid] > nums[mid-1] && nums[mid]> nums[mid+1]){
                    return mid;
                }
                else if(nums[mid] > nums[mid-1]){
                    low = mid +1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
