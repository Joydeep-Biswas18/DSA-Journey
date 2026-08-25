public class Leetcode152_Maximum_Product_Subarray {
    public static void main(String[] args) {
        int[] nums ={-2,0,-1};
        System.out.println(Max_product_subarray(nums));

        optimal_Approach obj = new optimal_Approach();
        System.out.println(obj.maximum_product_subarray(nums));

    }
    public static int Max_product_subarray(int [] nums){
        //Brute Force 
        int max_prod = Integer.MIN_VALUE;
        int start_index  =0;
        int endIndex =0;
        for(int i =0; i<nums.length;i++){
            int product=1;
            for(int j =i; j<nums.length;j++){
                product =product * nums[j];
                max_prod = Integer.max(max_prod, product);
                // start_index =i;
                // endIndex = j-i+1;


            }
        }
        return max_prod;


    }
}
class optimal_Approach{
     public static int maximum_product_subarray(int[] nums) {

        int max_prod = nums[0];
        int max_product = nums[0];
        int min_product = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int current = nums[i];

            // Save old max because we need it for min calculation
            int temp = max_product;

            max_product = Math.max(
                    current,
                    Math.max(max_product * current,
                             min_product * current)
            );

            min_product = Math.min(
                    current,
                    Math.min(temp * current,
                             min_product * current)
            );

            max_prod = Math.max(max_prod, max_product);
        }

        return max_prod;
    }
}
