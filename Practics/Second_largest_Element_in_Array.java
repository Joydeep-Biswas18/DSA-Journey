
//Second Largest Element in Array with Optimal solution Time Complexity O(n)
import java.util.Scanner;

public class Second_largest_Element_in_Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n =sc.nextInt();
        System.out.print("Enter the "+n+" Elements:");
        int [] arr = new int [n];
        for( int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max =Integer.MIN_VALUE;
        int Second_max =Integer.MIN_VALUE;

        for( int i=0; i<arr.length; i++){
            if(arr[i]>max){
                Second_max=max;
                max = arr[i];
            }
            else if( arr[i]>Second_max && arr[i]!=max){
                Second_max = arr[i];
            }
        }
        System.out.println("The Lagest Element is Array is :"+max);
        System.out.println("The Send Largest Element is :"+Second_max);

    }

}