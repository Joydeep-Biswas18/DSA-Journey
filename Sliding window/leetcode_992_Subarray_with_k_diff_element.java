
import java.util.HashMap;

public class leetcode_992_Subarray_with_k_diff_element {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4};

        long s1 = System.nanoTime();
        Solution obj = new Solution();
        int result = obj.count_subarray(arr, 3);
        System.out.println(result);
        long e1 = System.nanoTime();
        System.out.println(e1 - s1);

        //Second Optimal Approach
        long s2 = System.nanoTime();
        Solution_optimal obj_optimal = new Solution_optimal();
        int ans = obj_optimal.subarraysWithKDistinct(arr, 3);
        System.out.println(ans);
        long e2 = System.nanoTime();
        System.out.println(e2 - s2);
    }
}

class Solution {
    // Time Limit Exceede

    public int count_subarray(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < arr.length; j++) {
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

                if (map.size() == k) {
                    count++;
                } else if (map.size() > k) {
                    break;
                }
            }

        }

        return count;
    }

}

class Solution_optimal {

    public int subarraysWithKDistinct(int[] nums, int k) {
        return Optimal_solution(nums, k) - Optimal_solution(nums, k - 1);
    }

    public int Optimal_solution(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int count = 0;
        if (k <= 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size() > k) {

                int value = nums[left];

                map.put(value, map.get(value) - 1);

                if (map.get(value) == 0) {
                    map.remove(value);
                }

                left++;
            }
            count += (right - left + 1);
            right++;
        }
        return count;
    }

}
