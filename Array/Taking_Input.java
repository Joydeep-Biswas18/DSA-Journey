import java.util.Scanner;

public class Taking_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number of Elements of Array...");
        int n = sc.nextInt();
        System.out.println("Enter the elements ..");
        int [] arr = new int[n];

        //Input From user
        for ( int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        //Output in console
        for(int j =0; j< n; j++){
            System.out.print(arr[j]*2+", ");
        }

        sc.close();
    }
}
