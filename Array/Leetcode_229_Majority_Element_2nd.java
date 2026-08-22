
import java.util.*;

public class Leetcode_229_Majority_Element_2nd {

    public static void main(String[] args) {
        int[] nums = {1, 2};
        //Brute Force
        long s1 = System.nanoTime();
        System.out.println(majorityElement(nums));
        long e1 = System.nanoTime();
        System.out.println(e1-s1);

        //Using hashing
        long s2 = System.nanoTime();
        solution_hashmap obj = new solution_hashmap();
        System.out.println(obj.majorit_Element(nums));
        long e2 = System.nanoTime();
        System.out.println(e2-s2);
        
        
        //Most Optimal Solution
        long s3 = System.nanoTime();
        most_optimal_Approach obbj = new most_optimal_Approach();
        System.out.println(obbj.Major_Element(nums));
        long e3 = System.nanoTime();
        System.out.println(e3-s3);

    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > (n / 3)) {
                list.add(nums[i]);
            }

            if (list.size() == 2) {
                break;
            }
        }
        return list;

    }
}

class solution_hashmap {
    // i do it by fully myself

    public static List<Integer> majorit_Element(int[] nums) {
        int n = nums.length;
        int count = 0;
        List<Integer> result = new ArrayList<>(2);
        HashMap<Integer, Integer> map = new HashMap<>();

        //Looping
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            // Add to result only when the count just reaches mini
            if (map.get(num) == n / 3 + 1) {
                result.add(num);
            }

            if (result.size() == 2) {
                break;
            }
        }

        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() > n / 3) {
        //         result.add(entry.getKey());
        //     }
        //     if(result.size()==2){
        //         break;
        //     }
        // }
        return result;

    }
}

class most_optimal_Approach {
    //Boyer-Moore Voting Algorithm

    public static List<Integer> Major_Element(int[] nums) {
        int n = nums.length;
        int count1 = 0;
        int count2 = 0;
        int ele1 = 0;
        int ele2 = 0;

        for (int i = 0; i < n; i++) {
            if (count1 == 0 && ele2 != nums[i]) {
                count1 = 1;
                ele1 = nums[i];
            } else if (count2 == 0 &&  ele1 != nums[i]) {
                count2 = 1;
                ele2 = nums[i];
            } else if (ele1 ==nums[i]){
                count1++;
            }
            else if(ele2 == nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }

        }
        int major_element1 =0;
        int major_element2 =0;

        for(int i=0;i<n;i++){
            if(nums[i] == ele1){
                major_element1++;
            }
            if(nums[i] == ele2){
                major_element2++;
            }
        }
        List<Integer> result = new ArrayList<>();
        if(major_element1>(n/3)){
            result.add(ele1);
        }
        if(major_element2>(n/3)){
            result.add(ele2);
        }

        //Returning Return Statement
        return result;
    }
}
