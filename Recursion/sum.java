public class sum{
    public static void main(String[] args) {
        int result = sumN(100);
        System.out.println(result);
        
    }
    public static int sumN(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+sumN(n-1);
        }
        
    }
}
