
import java.util.*;

public class Leetcode_216_Combination_sum_three {

    //GIVEN K  = size of the List
    //given n = sum of the elements of the List
    //Elements are used from 1 to 9
    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 9));

    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Combination_sum_three(1, ds, ans, n, k);


        return ans;
    }

    public static void Combination_sum_three(int index, List<Integer> ds, List<List<Integer>> ans, int sum, int k) {
        //Base condition
        if (ds.size() == k) {
            if (sum == 0) {
                ans.add(new ArrayList<>(ds));
                return;

            }
        } else {
            for (int digit = index; digit <= 9; digit++) {
                
                //Take
                ds.add(digit);

                //Recursive Function call
                Combination_sum_three(digit + 1, ds, ans, sum - digit, k);

                //backtrack
                ds.remove(ds.size() - 1);

            }
        }

    }
}
