import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class left_Rotate_by_one_place {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,10};

        int [] ans = optimal_soln(arr, 3);

        System.out.println(Arrays.toString(ans));
        // int temp =arr[0];
        // for(int i=1; i<arr.length; i++){
        //     arr[i-1] = arr[i];
        // }
        // arr[arr.length -1] = temp;
       
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] +" ");
        // }
    }
    public static int[] left_rotate_K_Place_brute(int [] nums, int k){
        int n = nums.length;
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<k; i++){
            temp.add(nums[i]);
        }

        for(int i=k; i<n; i++){
            nums[i-k] = nums[i];
        }
        //For Put in last
        
        for(int i= n-k;i<n; i++){
            nums[i] = temp.get(i-(n-k));
            

        }
         
        return nums;            //Overall Time complexity = O(n+k)
    }
    static int[] optimal_soln(int [] nums, int k){
        int n = nums.length;
        k=k%n;
        reverse_array(nums, 0, k-1);
        reverse_array(nums, k, n-1);
        reverse_array(nums, 0, n-1);
        

        return nums;
    }
    static void reverse_array(int [] nums, int low , int high){
        while(low<=high){
            
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;

                low++;
                high --;

        }
        
    }
}
