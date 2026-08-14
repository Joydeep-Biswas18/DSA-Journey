import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int revnum =0;

        while(num >0){
            int digit = num%10;
            revnum = (revnum*10)+digit;
            num = num/10;
        }
        System.out.println(revnum);

    }
}
