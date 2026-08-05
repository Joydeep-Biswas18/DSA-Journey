
public class Check_sort_array{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        int []arr ={12,32,42,54,69};
        // for(int i=0; i<arr.length;i++){
        //     arr[i]= sc.nextInt();
        // }
        boolean isSort = Check_sort(arr);

        System.out.println(isSort);

    }
    public static boolean Check_sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            // if(arr[i]<arr[i+1]){// that cause out of bound
            // if(arr[i]>=arr[i-1]){
            if(arr[i-1]<arr[i]){
            }
            else{
                return false;
            }
        }
        return true;
    }
}