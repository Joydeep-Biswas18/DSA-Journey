import java.util.*;

public class Leetcode_907_Sum_of_Subarray_Minimums {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 4 };
        System.out.println(SumMinSubarray(nums));

    }

    // brute Force Approachclass Solution {
    public static int Sum_subarray_min(int[] arr) {

        int n = arr.length;
        long sum = 0;

        for (int i = 0; i < n; i++) {

            int min_ele = Integer.MAX_VALUE;

            for (int j = i; j < n; j++) {

                min_ele = Math.min(arr[j], min_ele);

                sum += min_ele;
            }
        }

        return (int) (sum % 1000000007);
    }// That code gets TLE(Time Limit Exceced)

    // Try to think of Sliding Window
    public static int SumMinSubarray(int[] nums) {

        int n = nums.length;
        int[] previousNext = pse(nums);
        int [] next_smaller_equal = nse(nums);

        long sum = 0;
        for (int i = 0; i < n; i++) {
            int left = i - previousNext[i];
            int right = next_smaller_equal[i] - i;
            sum += (int) (right * left * nums[i]) % 1000000007;

        }
        return (int) sum;

    }

    public static int[] pse(int[] nums) {
        int n = nums.length;
        int[] find_pse = new int[n];
        Arrays.fill(find_pse, -1);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <n; i++) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                find_pse[i] = st.peek();
            }
            st.push(i);
        }
        return find_pse;

    }

    public static int[] nse(int[] nums) {
        int n = nums.length;
        int[] find_nseequal = new int[n];
        Arrays.fill(find_nseequal, n);
        Stack<Integer> st = new Stack<>();
        for (int i = n-1; i>=0; i--) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                find_nseequal[i] = st.peek();
                
            }
            st.push(i);
        }
        return find_nseequal;

    }

}
