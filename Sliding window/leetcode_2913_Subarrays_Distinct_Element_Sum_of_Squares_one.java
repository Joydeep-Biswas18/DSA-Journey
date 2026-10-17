import java.util.*;

public class leetcode_2913_Subarrays_Distinct_Element_Sum_of_Squares_one {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        System.out.println(Sum_of_square(list));


    }

    public static int Sum_of_square(List<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            HashSet<Integer> hs = new HashSet<>();
            for (int j = i; j < nums.size(); j++) {
                hs.add(nums.get(j));
                sum += hs.size()* hs.size();
            }

        }
        return sum;
    }
}
