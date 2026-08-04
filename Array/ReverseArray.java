public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {2,3,453,32,53,642,3,1,23};
        int n = arr.length;
        print(arr);

        int i =0; 
        int j = n-1;
        while(i<j){
            swap(arr , i , j);
            i++;
            j--;
        }
        print(arr);
    }
    public static void print(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int [] arr , int i , int j){
        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }

}
