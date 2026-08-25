
import java.util.*;

public class Leetcode_15_3_sum {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        long s1 = System.nanoTime();
        System.out.println(Triplet_sum(nums));
        long e1 = System.nanoTime();
        System.out.println(e1 - s1);

        // Better approach
        long s2 = System.nanoTime();
        Solution_three_sum_better_hashing obj = new Solution_three_sum_better_hashing();
        System.out.println(obj.three_sum(nums));
        long e2 = System.nanoTime();

        System.out.println(e2 - s2);
        long s3 = System.nanoTime();
        Most_optimal_solution obj1 = new Most_optimal_solution();
        System.out.println(obj1.optimal_three_sum(nums));
        long e3 = System.nanoTime();
        System.out.println(e3 - s3);
    }

    public static List<List<Integer>> Triplet_sum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> ds = new ArrayList<>();

                        ds.add(nums[i]);
                        ds.add(nums[j]);
                        ds.add(nums[k]);

                        set.add(ds);
                    }
                }
            }
        }

        ans.addAll(set);

        return ans;
    }
}

// Class to solve 3-sum problem
class Solution {

    // Function to find triplets with sum zero
    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        // Store unique triplets
        Set<List<Integer>> ans = new HashSet<>();

        // First loop for first element
        for (int i = 0; i < n; i++) {
            // Set to store elements seen in this iteration
            Set<Integer> hashset = new HashSet<>();

            // Second loop for second element
            for (int j = i + 1; j < n; j++) {
                // Calculate third element needed
                int third = -(arr[i] + arr[j]);

                // If third already in set, we found a triplet
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    Collections.sort(temp);
                    ans.add(temp);
                }

                // Add current element to set
                hashset.add(arr[j]);
            }
        }

        // Convert set to list
        return new ArrayList<>(ans);
    }
}

class Solution_three_sum_better_hashing {

    public static List<List<Integer>> three_sum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> hs = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]);
                if (hs.contains(third)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    Collections.sort(temp);

                    ans.add(temp);
                }
                hs.add(nums[j]);
            }
        }

        return new ArrayList<>(ans);
    }
}

class Most_optimal_solution {

    public static List<List<Integer>> optimal_three_sum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length-1; i++) {

            // Skip duplicate i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                }

                else if (sum > 0) {
                    k--;
                }

                else {

                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Store current values
                    int left = nums[j];
                    int right = nums[k];

                    // Move pointers
                    j++;
                    k--;

                    // Skip duplicates of j
                    while (j < k && nums[j] == left) {
                        j++;
                    }

                    // Skip duplicates of k
                    while (j < k && nums[k] == right) {
                        k--;
                    }
                }
            }
        }
        System.gc();
        return ans;
    }
}