
import java.util.*;
// Separate class containing only the main method

public class Leetcode_169_Majority_Element {

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 11, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        // Create an instance of Solution class
        Solution sol = new Solution();

        int ans = sol.majorityElement(arr);

        // Print the majority element found
        System.out.println("The majority element is: " + ans);

        Solution_2 obj = new Solution_2();
        int ans2 = obj.Major_element(arr);
        System.out.println(ans2);

    }
}

// Class containing the majority element logic
class Solution {

    // Function to find the majority element in an array
    public int majorityElement(int[] nums) {

        // Size of the given array
        int n = nums.length;

        // Hash map to store element counts
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        /* Iterate through the map to
           find the majority element */
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        // Return -1 if no majority element is found
        return -1;
    }
}

class Solution_2 {

    public int Major_element(int[] arr) {
        int count_voting = 0;
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count_voting == 0) {// when count_voting will be zero that means the selected element is not major in this small array and that reflects this elemenet not be the major
                element = arr[i]; // After that i assign next element as element and increament count_voting
                count_voting++;
            } else if (element == arr[i]) {
                count_voting++;
            } else {
                count_voting--;
            }

        }
        int count_major_element = 0; // that count refers to the eleemnt that has most vote i mean which is not count_voting is zero

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count_major_element++;  // That count total number of voting element and calculate how many time it appear 
            }

        }
        if (count_major_element > (arr.length / 2)) {       //If it has comming more than half of the existing Array so that is our ans
            return element;
        }
        return -1;
    }

}
