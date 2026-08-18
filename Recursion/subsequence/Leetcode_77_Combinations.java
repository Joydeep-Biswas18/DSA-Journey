import java.util.ArrayList;
import java.util.List;

public class Leetcode_77_Combinations {

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }

    public static List<List<Integer>> combine(int n, int k) {

        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        All_combination(1, n, k, ds, ans);

        return ans;
    }

    public static void All_combination(
            int start,
            int n,
            int k,
            List<Integer> ds,
            List<List<Integer>> ans) {

        // Base case
        if (ds.size() == k) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        // Choose numbers from start to n
        for (int i = start; i <= n; i++) {

            // Take
            ds.add(i);

            All_combination(i + 1, n, k, ds, ans);

            // Backtrack
            ds.remove(ds.size() - 1);
        }
    }
}