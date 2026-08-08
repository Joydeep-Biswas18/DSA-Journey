public class Search_In_Rotate_array_Leetcode_33{
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(binary_search_in_rotated_array(arr, 10 ));
        
    }
    static int binary_search_in_rotated_array(int [] nums , int target){
        int low =0;
        int high = nums.length -1;
        
        while(low <= high){
            int mid = low +(high -low)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[low]<= nums[mid]){
                if(nums[low]<= target && target<= nums[mid]){
                    high = mid -1;
                }
                else{
                    low = mid +1;
                }


            }
            else{
                if(nums[mid]<= target && target <= nums[high]){
                    low = mid+1;

                }
                else{
                    high = mid-1;
                }

            }
            
        }
        return -1;
        
}
}