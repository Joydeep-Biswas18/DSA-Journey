public class power_x {
    public static void main(String[] args) {
        System.out.println(myPow(0.5,2));
    }
   public static double myPow(double x, int n) {
        long N = n;
        double ans = 1;

        if(N<0){
            x = (1/x);
            N = -N;
        }
        while(N>0){
            if(N%2==1){

            ans = ans * x;
            N = N-1;
            }
            else{
                x = x*x;
                N = N/2;
            }

        }
        return ans;
    }
}
