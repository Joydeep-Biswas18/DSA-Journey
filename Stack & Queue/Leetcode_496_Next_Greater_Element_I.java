import java.util.*;

public class Leetcode_496_Next_Greater_Element_I {
    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 5, 2, 4 };
        int[] nums2 = { 6, 5, 4, 3, 2, 1, 7 };
        System.out.println(Arrays.toString(Next_greaater_eleement(nums1, nums2)));

    }

    public static int[] Greater_Eleement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] result = new int[n];

        // Iterate over first Array
        for (int i = 0; i < n; i++) {
            // Iterate over 2nd Array
            for (int j = 0; j < m; j++) {
                if (nums1[i] == nums2[j]) {

                    // Initially assume there is no greater element
                    result[i] = -1;

                    // Search to the right of nums2[j]
                    for (int k = j + 1; k < m; k++) {

                        // First greater element found
                        if (nums2[k] > nums1[i]) {
                            result[i] = nums2[k];
                            break;
                        }
                    }

                    // nums1[i] found in nums2, so stop searching nums2
                    break;
                }
            }
        }

        return result;
    }

    public static int[] Next_greaater_eleement(int[] nums1, int[] nums2) {
        int n = nums1.length;

        int[] result = new int[n];

        Stack<Integer> st = new Stack<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        // Process nums2 from right to left
        for (int j = nums2.length - 1; j >= 0; j--) {

            while (!st.isEmpty() && st.peek() <= nums2[j]) {
                st.pop();
            }

            if (st.isEmpty()) {
                map.put(nums2[j], -1);
            } else {
                map.put(nums2[j], st.peek());
            }

            st.push(nums2[j]);
        }

        // Find answers for nums1
        for (int i = 0; i < n; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}