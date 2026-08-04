
//Take Marks of Student as Input and give the roll number of student which are not qualified in examination take array indexas Roll number of student
import java.util.Scanner;
public class marks_student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Student.");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter Elements of Array:");
        //input 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Roll Numbers of student who get fail");
        for(int j=0; j<n; j++){
            if(arr[j]<35){
                System.out.print((j+1) +" ");
            }
        }

    }
    
}