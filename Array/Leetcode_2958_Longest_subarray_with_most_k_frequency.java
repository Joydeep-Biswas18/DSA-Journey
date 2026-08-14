
import java.util.HashMap;

public class Leetcode_2958_Longest_subarray_with_most_k_frequency {

    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1,2,1,2};
        int result = length_subarray(nums, 1);
        System.out.println(result);
    }

    public static int length_subarray(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int max_length = 0;
        if (k <= 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        while (r < nums.length) {
           map.put(nums[r], map.getOrDefault(nums[r], 0)+1);
            while (map.get(nums[r]) > k) {

                int value = nums[l];
                map.put(value, map.get(value) - 1);
                if (map.get(value) == 0) {
                    map.remove(value);
                }
                l++;
            }
            max_length = Math.max(max_length, r - l + 1);
            r++;
        }
        return max_length;
    }
}
