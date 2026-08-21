
import java.util.*;

public class Leaders_in_array {

    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 3, 0, 6};
        List<Integer> ans = new ArrayList<>();
        System.out.println(learders_in_array(nums, ans));
        
        List<Integer> result = new ArrayList<>();
        System.out.println(Leader_Array(nums, result));

    }//Brute FOrce Approach

    public static List<Integer> learders_in_array(int[] nums, List<Integer> ds) {
        // List<Integer> ds = new ArrayList<>();
        // boolean [] leader = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    leader = false;
                    break;
                }
                leader = true;
            }
            if (leader) {
                ds.add(nums[i]);
            }
        }
        return ds;

    }

    //Now The Optimal approach is Traverse from the last of the array
    //With Time Complexity is Near about O(n)
    public static List<Integer> Leader_Array(int[] nums, List<Integer> ds){
        int max = nums[nums.length-1];
        ds.add(max);
        for(int i = nums.length -1; i>0 ; i--){
            if(nums[i]>max){
                ds.add(nums[i]);
                max= nums[i];
            }
        }
        return ds;
    }
    
}
