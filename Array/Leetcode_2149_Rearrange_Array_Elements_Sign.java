
import java.util.*;

public class Leetcode_2149_Rearrange_Array_Elements_Sign {

    public static void main(String[] args) {
        int[] nums = {28, -41, 22, -8, -37, 46, 35, -9, 18, -6, 19, -26, -37, -10, -9, 15, 14, 31};
        int[] num1 = {2, 3, 4, 5, 6, -3, -5, -1,4,6,7,8,9,6554,7,78};
        System.out.println(Arrays.toString(rearrangeArray(nums)));

        // // /Second Optimal Approach
        Solution_2 obj = new Solution_2();
        obj.Dispaly_arrange_array(nums);
        System.out.println(Arrays.toString(nums));

        //Variety two
        Solution_3 obj_1 = new Solution_3();
        obj_1.rearrangeArray(num1);
        System.out.println(Arrays.toString(num1));

    }

    public static int[] rearrangeArray(int[] nums) {
        print_rearrrange_Array(nums);
        return nums;

    }

    public static void print_rearrrange_Array(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> Neg = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos.add(nums[i]);
            }
            if (nums[i] < 0) {
                Neg.add(nums[i]);
            }
        }
        for (int j = 0; j < nums.length / 2; j++) {
            nums[2 * j] = pos.get(j);
            nums[2 * j + 1] = Neg.get(j);
        }
    }
}

class Solution_2 {

    public static void Dispaly_arrange_array(int[] nums) {
        int Pos_index = 0;
        int Neg_Index = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                nums[Pos_index] = nums[i];
                Pos_index += 2;
            } else {
                nums[Neg_Index] = nums[i];
                Neg_Index += 2;
            }
        }

    }
}

class Solution_3 {

    public static int[] rearrangeArray(int[] nums) {
        Print_rearrage_array(nums);
        return nums;

    }

    //When No of Positive and Negative are not equal 
    public static void Print_rearrage_array(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> Neg = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                pos.add(nums[i]);
            } else {
                Neg.add(nums[i]);
            }
        }

        if (pos.size() > Neg.size()) {
            for (int j = 0; j < Neg.size(); j++) {
                nums[2 * j] = pos.get(j);
                nums[2 * j + 1] = Neg.get(j);
            }
            int n = Neg.size();
            for (int i = 2 * Neg.size(); i < nums.length; i++) {
                nums[i] = pos.get(n);
                n++;
            }
        } else {
            for (int j = 0; j < pos.size(); j++) {
                nums[2 * j] = pos.get(j);
                nums[2 * j + 1] = Neg.get(j);
            }
            int p = pos.size();
            for (int i = 2 * pos.size(); i < nums.length; i++) {
                nums[i] = Neg.get(p);
                p++;
            }

        }
    }
}
