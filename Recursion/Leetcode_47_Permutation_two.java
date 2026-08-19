
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_47_Permutation_two {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        List<List<Integer>> result = new ArrayList<>();
        result = permuteUnique(nums);
        System.out.println(result);

    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];

        Permutation_print_2nd(nums, ans, ds, freq);

        return ans;

    }

    public static void Permutation_print_2nd(int[] nums, List<List<Integer>> ans, List<Integer> ds, boolean[] freq) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        Set<Integer> used = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (!freq[i] && !used.contains(nums[i])) {

                used.add(nums[i]);

                freq[i] = true;
                ds.add(nums[i]);

                Permutation_print_2nd(nums, ans, ds, freq);

                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }

    }

}
