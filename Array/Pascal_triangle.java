
import java.util.ArrayList;
import java.util.List;

public class Pascal_triangle {

    public static void main(String[] args) {
        System.out.println(N_c_R(10, 10));
        System.out.println(generator(5));
        generate_as_number(5);

    }

    static int N_c_R(int n, int r) {
        int ans = 1;
        for (int i = 0; i < r; i++) {
            if (n == r || r == 0) {
                return 1;
            }
            if (r > n) {
                return -1;
            }

            ans = ans * (n - i);
            ans = ans / (i + 1);
        }
        return ans;
    }

    static List<List<Integer>> generator(int numrow) {

        List<List<Integer>> result = new ArrayList<>();

        int n = numrow;
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            int element = 1;
            for (int j = 0; j <= i; j++) {
                row.add(element);
                element = element * (i - j) / (j + 1);

            }
            result.add(row);
        }
        return result;

    }

    static void generate_as_number(int n) {
        for (int i = 0; i < n; i++) {
            int element = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(element);
                element = element * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
