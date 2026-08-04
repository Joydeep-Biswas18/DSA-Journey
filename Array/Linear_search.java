import java.util.Scanner;
public class Linear_search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int key = sc.nextInt();
        int [] arr = {23,45,86,35,25,100};
        boolean found = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.println("The number is found at Index"+i);
                found =true;
                break;

            }
        }
        if(!found){
            System.out.println("The number is not present in the array");
        }

    }
}