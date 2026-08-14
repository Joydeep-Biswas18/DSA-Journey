

import java.util.Scanner;


public class count_prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;

        for(int i=2; i<num;i++){
            boolean isprime =true;
            for(int j=2; j*j<=i;j++){
                if(i%j==0){
                    isprime= false;
                    break;
                }
            }
            if(isprime){
                count++;
            }
            
        }
        System.out.println(count);
    }
}
