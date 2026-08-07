public class Binary_Search {
    public static void main(String[] args) {
        int [] arr = {21,32,546,68,8,7995,76,100};
        int result = binary_search(arr, 53);
        System.out.println(result);    
    }
    static int binary_search(int [] arr, int target){
        int n = arr.length;
        int low =0; 
        int high = n-1;
        while(low <high){
            int mid = low +(high - low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if( arr[mid]< target){
                low = mid +1;
            }
            else{
                high = mid-1;
            }
        }
        // return low; // that return the index where we put the target elemenr in sorted arrray
        return -1;  // if the target element is not present 
    }
}
