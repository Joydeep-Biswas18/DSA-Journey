import java.util.Arrays;

public class Reverse_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,52,4};
        int n = arr.length;
        // reverse(arr, 0, n-1);
        System.out.println(Arrays.toString(reverse(arr, 0, n-1)));

        Solution_2 obj = new Solution_2();
        obj.Reverse_array(arr, 0);
        System.out.println(Arrays.toString(arr));

        Solution_pallindrom obj2 = new Solution_pallindrom();
        String name ="MADAM";
        System.out.println(obj2.check_pallindrom(name, 0));
        System.out.println(obj2.check_pallindrom("Joydeep", 0));
        

        
    }
    public static int[] reverse(int [] arr,int l , int r){
        if(l>=r){
            return arr;
        }
        else{
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            return reverse(arr, l+1, r-1);

        }

    }
    
}
class Solution_2{
    public int[] Reverse_array(int[]arr,int i){
        int n = arr.length;
        if(i>=n/1){
            return arr;

        }
        else{
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1]= temp;

            return Reverse_array(arr, i+1);
        }
    }
}
class Solution_pallindrom {

    public boolean check_pallindrom(String name, int i) {
        int n = name.length();

        if (i >= n / 2) {
            return true;
        }

        if (name.charAt(i) != name.charAt(n - i - 1)) {
            return false;
        }

        return check_pallindrom(name, i + 1);
    }
}