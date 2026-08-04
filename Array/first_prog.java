package Array;
public class first_prog{
    public static void main(String[] args) {
        int [] arr = new int[7];
        arr[0]=75;
        arr[1]=3;
        arr[2]=25;
        arr[3]=75;
        arr[4]=35;
        arr[5]=36;
        arr[6]=67;
        int i;

        System.out.println(arr[3]);
        for(i=0; i<arr.length;i++){
            System.out.println(arr[i]);

        }

        int [] y = {2,34,5,4,6,75,45,10};
        for(int j=0; j<y.length; j++){
            System.out.println(y[j]);
        }
    } 
}