

import java.util.*;

public class print_all_divisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long s1 = System.nanoTime();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        long e1 = System.nanoTime();
        System.out.println(e1 - s1);

        long s2 = System.nanoTime();
        List<Integer> divisors = print_divisor(n);
        Collections.sort(divisors);
        System.out.println(divisors);
        long e2 = System.nanoTime();

        System.out.println(e2 - s2);

    }

    public static List<Integer> print_divisor(int number) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i * i < number; i++) {
            if (number % i == 0) {
                list.add(i);
                if ((number / i) != i) {

                    list.add(number / i);
                }
            }
        }
        return list;

    }

}
