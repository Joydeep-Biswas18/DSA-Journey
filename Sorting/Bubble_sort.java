import java.util.Arrays;
public class Bubble_sort {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,65,7676,86,86,878,100};
        int n = arr.length;

        //outer loop
        for(int i=0; i<n-1;i++){
            //inner loop
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] =temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
