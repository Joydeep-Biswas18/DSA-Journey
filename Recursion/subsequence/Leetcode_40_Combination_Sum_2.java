
import java.util.*;

public class Leetcode_40_Combination_Sum_2 {

    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        ans = (Combination_sum(nums, 0, 8, ds));
        System.out.println(ans);

    }

    public static List<List<Integer>> Combination_sum(int[] nums, int index, int target, List<Integer> ds) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        //Base caseif
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return ans;
        }
        
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i - 1] == nums[i]) {
                continue;
            }
            if(nums[i] > target){
                break;
            }

            //take 
            ds.add(nums[i]);
           
        List<List<Integer>> temp =
                Combination_sum(nums, i + 1, target - nums[i], ds);

        // ✅ Collect returned answers
        ans.addAll(temp);


            //BackTruck
            ds.remove(ds.size()-1);
            

        }
        return ans;

    }
}
