import java.util.Scanner;
public class Amstrong_num {
    public static void main(String[] args) {
        boolean isAmstrome = false;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        int dup = num;

        while(num>0){
            int digit = num%10;
            sum = sum + (digit*digit*digit);
            num = num/10;
        }
        if(sum==dup){
            isAmstrome = true;
        }
        System.out.println(isAmstrome);
    }
}
