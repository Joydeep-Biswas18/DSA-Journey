
import java.util.HashMap;

public class leetcode_992_Subarray_with_k_diff_element {

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4};

        long s1 = System.nanoTime();
        Solution obj = new Solution();
        int result = obj.count_subarray(arr, 3);
        System.out.println(result);
        long e1 = System.nanoTime();
        System.out.println(e1-s1);

        //Second Optimal Approach
        long s2 = System.nanoTime();
        Solution_optimal obj_optimal = new Solution_optimal();
        int ans = obj_optimal.function_optimal(arr, 3);
        System.out.println(ans);
        long e2 = System.nanoTime();
        System.out.println(e2-s2);
    }
}

class Solution {

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
    public int function_optimal(int [] arr, int k){
        return count_subarray_optimal(arr, k) - count_subarray_optimal(arr, k-1);
    }

    private int count_subarray_optimal(int[] arr, int k) {
        int l = 0;
        int r = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (r < arr.length) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);
            while(map.size() > k) {
                map.put(arr[l], map.get(arr[l]) - 1);
                if (map.get(arr[l]) == 0) {
                    map.remove(arr[l]);
                }
                l++;
            }
            count = count + (r-l+1);    
        r++;
    }
    return count;
}
}
