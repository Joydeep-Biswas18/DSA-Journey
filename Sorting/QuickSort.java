import java.util.Arrays;
// package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr ={23,34,5,64,23,6,454,76,6686,86,6};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));  
        //we can't print Array directly so i use Arrays.toString(arr)       
    }
    static void quickSort(int [] arr, int low , int high){
        if(low < high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
        
        

    }
    static int partition(int [] arr , int low , int high){
        int i = low+1; 
        int j = high;
        int pivot = arr[low];

        while(i<=j){
            while(i<= high && arr[i] <= pivot){
                i++;
            }
            while(j>=low && arr[j]>pivot){
                j--;
            }
            if(i<j){

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;


    }
    
}
