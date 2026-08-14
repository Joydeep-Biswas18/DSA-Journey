
import java.util.Scanner;

public class count_digit_in_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            count ++;
            num = num / 10;
        }
        System.out.println(count);
    }
}
