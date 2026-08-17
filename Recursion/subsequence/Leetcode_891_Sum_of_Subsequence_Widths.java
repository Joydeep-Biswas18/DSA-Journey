import java.util.*;

public class Leetcode_891_Sum_of_Subsequence_Widths {

    static final long MOD = 1_000_000_007L;

    public static void main(String[] args) {
        int[] nums = {2, 1, 3};

        System.out.println(
            Max_widths(nums, 0, new ArrayList<>())
        );
    }

    public static long Max_widths(
            int[] nums,
            int index,
            List<Integer> result) {

        // Base condition
        if (index == nums.length) {

            if (!result.isEmpty()) {
                long widths = (long) Collections.max(result)
                             - Collections.min(result);

                return widths;
            }

            return 0;
        }

        // TAKE
        result.add(nums[index]);

        long take = Max_widths(nums, index + 1, result);

        // BACKTRACK
        result.remove(result.size() - 1);

        // NOT TAKE
        long non_take = Max_widths(nums, index + 1, result);

        return (take + non_take) % MOD;
    }
}