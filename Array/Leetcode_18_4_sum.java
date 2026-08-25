
import java.util.*;

public class Leetcode_18_4_sum {

    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 2, 2, 4, 6, 8, 10};
        System.out.println(Four_sum(nums, 12));

        //Most Optimal Solution
        Most_optimal_solution obj = new Most_optimal_solution();
        System.out.println(obj.optimal_Four_sum(nums, 12));

    }

    public static List<List<Integer>> Four_sum(int[] nums, int target) {
        int n = nums.length;

        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                Set<Long> hs = new HashSet<>();

                for (int k = j + 1; k < n; k++) {

                    long four = (long) target
                            - nums[i]
                            - nums[j]
                            - nums[k];

                    if (hs.contains(four)) {

                        List<Integer> temp = Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[k],
                                (int) four
                        );

                        Collections.sort(temp);

                        ans.add(temp);
                    }

                    hs.add((long) nums[k]);
                }
            }
        }

        return new ArrayList<>(ans);
    }
}

class Most_optimal_solution {

    public static List<List<Integer>> optimal_Four_sum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int k = n - 1;
                int l = j + 1;
                while (l < k) {
                    long sum = (long) (nums[i] + nums[j] + nums[k] + nums[l]);
                    if (sum > target) {
                        k--;

                    } else if (sum < target) {
                        l++;

                    } else {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[l], nums[k]));
                        int left = nums[l];
                        int right = nums[k];

                        k--;
                        l++;

                        // Skip duplicates of j
                        while (l < k && nums[l] == left) {
                            l++;
                        }

                        // Skip duplicates of k
                        while (l < k && nums[k] == right) {
                            k--;
                        }

                    }
                }
            }

        }
        return ans;
    }
}
