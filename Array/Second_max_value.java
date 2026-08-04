public class Second_max_value {
    public static void main(String[] args) {
        int [] arr = {23,12,324,43,546,23,100};
        int max = Integer.MIN_VALUE;
        int Second_max = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            if(arr[i]>max){
                Second_max = max;
                max = arr[i];

            }
            else if (arr[i]> Second_max && arr[i]!=max) {
                Second_max = arr[i];
            }
        }
        System.out.println("The LArgest element is "+max);
        System.out.println("The LArgest element is "+Second_max);
    }
}
