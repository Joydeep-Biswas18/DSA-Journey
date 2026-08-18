
import java.util.ArrayList;
import java.util.List;

public class Leetcode_90_Subsets_2nd {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        System.out.println(subsetsWithDup(nums));

    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        

        All_subset(nums, 0, ds, ans);
        return ans;

    }

    public static void All_subset(int[] nums, int index, List<Integer> ds, List<List<Integer>> ans) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        } else {
            //take 
            ds.add(nums[index]);
            //function call
            All_subset(nums, index + 1, ds, ans);

            //BackTrack
            ds.remove(ds.size() - 1);

            //Non take option
            All_subset(nums, index + 1, ds, ans);

        }

    }

}
