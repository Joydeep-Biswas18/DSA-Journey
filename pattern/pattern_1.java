
import java.util.Scanner;

// package pattern;

public class pattern_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
