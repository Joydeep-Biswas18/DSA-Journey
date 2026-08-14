
import java.util.Scanner;
public class pallindrom_num {
    
    public static void main(String[] args) {
        boolean isPallindrom =false;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dup = num;
        int revnum =0;

        while(num>0){
            int digit = num%10;
            revnum = (revnum*10)+digit;
            num = num/10;
        }
        if(revnum==dup){
            isPallindrom = true;
        }
        System.out.println(isPallindrom);

    }
}
