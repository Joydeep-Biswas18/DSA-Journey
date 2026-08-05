import java.util.Scanner;

public class pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n;i++){
            for(int j=0; j<i-1; j++){
                System.out.print(" ");
            }
            for( int k=2*(n-i)-1; k>=1; k--){
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
