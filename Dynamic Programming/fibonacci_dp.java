import java.util.*;

public class fibonacci_dp {
    public static void main(String[] args) {
        System.out.println("Enter the number that want to finf=d its fibonacci");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        //Tabulization Method
        dp[0] = 0;
        dp[1] = 1;
        for(int i =2; i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println("The Answer is " + dp[n]);
        

        //Space Optimization
        int prev = 1;
        int prev2 = 0;

        for(int i =2; i<= n; i++){
            int curri = prev + prev2;
            prev2 = prev;
            prev = curri;

        }
        System.out.println("The ANswer is "+ prev);
        
    }
    public static int fibo(int n , int [] dp){
        //Base case
        if(n<=1) return n;
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n] = fibo(n-1, dp) + fibo(n-2, dp);
    }

    
}
