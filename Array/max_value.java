// Find The max value present in a Array

public class max_value {
    public static void main(String[] args) {
        int [] arr = {12,34,564,23,199,655,1000};
        int max_value = arr[2];         //take any element in the array for better solution
        for( int i=0; i<arr.length; i++){
            if(arr[i]>= max_value){
                max_value=arr[i];
            }
        }
        System.out.println(max_value);
    }
}
