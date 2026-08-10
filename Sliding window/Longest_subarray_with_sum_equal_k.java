//Find the longest length of subarray whose sum equal to k
import java.util.HashMap;

public class Longest_subarray_with_sum_equal_k {

    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] arr = {10, 5, 2, 1,1,2,3,0,7, 1, 9};
        System.out.println(num_subarray(arr, 15));
        long end = System.nanoTime();
        System.out.println(end - start + " ns");

        long st2 = System.nanoTime();
        System.out.println(num_subarray_hashmap(arr, 15));
        long en2 = System.nanoTime();
        System.out.println(en2 - st2);

        long st3 = System.nanoTime();
        System.out.println(_length_subarray_optimal(arr, 15));
        long en3 = System.nanoTime();
        System.out.println(en3 - st3);

    }
    // Brute Force approach based on nested looping
    static int num_subarray(int[] nums, int k) {
        int max_length = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum=0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    max_length = Math.max(max_length, j-i+1);
                }
            }
        }
        return max_length;
    }

   static int num_subarray_hashmap(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    int prefixSum = 0;
    int max_length = 0;

    map.put(0, -1);

    for (int i = 0; i < nums.length; i++) {
        prefixSum += nums[i];

        // Check if there exists a previous prefix sum
        if (map.containsKey(prefixSum - k)) {
            int length = i - map.get(prefixSum - k);
            max_length = Math.max(max_length, length);
        }

        // Store only the first occurrence of the prefix sum
        if (!map.containsKey(prefixSum)) {
            map.put(prefixSum, i);
        }
    }

    return max_length;
}
    // using Two pointer or sliding window which gives us most optimal solution 

    static int _length_subarray_optimal(int [] nums, int k){
        int max_length = 0;
        int sum =0 ;
        int l =0;
        int r = 0;
        while(r< nums.length){
            //condition
            sum +=nums[r];
            if(sum>k){
                sum-=nums[l];
                l++;

            }
            max_length = Math.max(max_length, r-l+1);


            //increment
            r++;
        }
        return max_length;
    }
}
