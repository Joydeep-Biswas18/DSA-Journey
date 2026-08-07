public class Next_permutation_leetCode_31 {
    public static void main(String[] args) {
        int [] arr ={3,9,2,1,0};
        int ans [] = Next_permutation(arr);
        for (int x : ans) {
            System.out.print(x + " ");
        }

    }
    public static int[] Next_permutation(int [] nums){
        int ind = -1;
        int n = nums.length;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }           
        }
        if(ind ==-1){
                reverse(nums,0,n-1);
                return nums;
            }
        for(int j=n-1; j>ind; j--){
            if(nums[j]>nums[ind]){
                int temp = nums[ind];
                nums[ind]=nums[j];
                nums[j] = temp;
                break;
            }         
        }
        reverse(nums,ind+1,n-1);
        
        return nums;

    }
    
    public static int[] reverse(int[]arr,int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;

            start++;
            end--;
        }

        return arr;
        
}
}
