public class Two_Sum {
    public static void main(String[] args) {
        int [] arr = {12,2,34,35,64,74,90,20};
        int [] ans = twoSum(arr,150);
        System.out.println("the Array is "+"["+ans[0] +","+ans[1]+"]");
      
    }
        public static int[] twoSum(int [] arr , int target){
            // int [] ansArray = new int [2];
            for( int i=0; i<arr.length; i++){
                for(int j = i+1; j<arr.length; j++){
                    if((arr[i]+ arr[j])==target){
                        return new int[]{i,j};

                    }
                }
            }
            return new int []{-1,-1};
            

        }

}
