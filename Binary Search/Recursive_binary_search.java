public class Recursive_binary_search{
    public static void main(String[] args) {
        int [] arr = { 1,2,34,5,67,99};
        
        int result = binary_search(arr, 0, arr.length, 5);
        System.out.println(result);
        
    }

    static int binary_search(int [] arr , int low , int high , int target){
        if(low>high){
            return -1;
        }
        int mid = low +(high -low)/2;
        if(arr[mid]== target){
            return mid;
        }
        else if(arr[mid]< target){
            binary_search(arr, mid+1, high, target);
        }
        else{
            binary_search(arr, low, mid-1, target);
        }
        return -1;
    }
}