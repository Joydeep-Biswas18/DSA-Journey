public class lower_bound {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,3,5,8,8,10,10,11};
        int result =lower_bound(arr, 9);
        System.out.println(result);
    }
    static int lower_bound(int []arr , int x){
        int low =0;
        int n = arr.length;
        int high = n-1;
        int ans = n;
        while(low<= high){
            int mid = low +( high -low)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid +1;
            
            }

        }
        return ans;
    }
}
