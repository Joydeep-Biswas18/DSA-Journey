import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci_num(n));
        
    }
    public static int fibonacci_num(int n){
        if(n<=2){
            return 1;
        }
        if(n<0){
            return -1;
        }
        else{
            return fibonacci_num(n-1) + fibonacci_num(n-1);

    }
}
}
