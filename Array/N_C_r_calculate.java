
public class N_C_r_calculate {

    public static void main(String[] args) {
        System.out.println(N_c_R(6, 3));

    }

    static long N_c_R(int N, int R) {

        long ans = 1;
        for (int i = 0; i < R; i++) {
            if (N == R || R == 0) {
                return 1;
            }
            if (R > N) {
                return -1;
            }
            ans = ans * (N - i);
            ans = ans / (i + 1);

        }
        return ans;
    }
}
