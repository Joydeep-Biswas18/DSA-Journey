// package Sliding window;

public class leetCode_1004 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] arr ={1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1};
        // int length = Max_consecutive_1(arr, 2);
        Max_consecutive_1(arr, 2);
        long end = System.nanoTime();
        System.out.println();
        System.out.println("Time"+(end-start)+"ns");
        
        long start1 = System.nanoTime();
        Further_optimization(arr, 2);
        // System.out.println(length1);
        long end1 = System.nanoTime();
        System.out.println();
        System.out.println("Time"+(end1-start1)+"ns");
        
    }
    public static void Max_consecutive_1(int [] nums ,int k){
        int l =0,r=0,zeroes=0,max_length=0;
        int start=0;
        int end=0;
    
        while(r<nums.length){
            if (nums[r]==0){
                zeroes++;
            }
            while(zeroes > k){
                if(nums[l]==0){
                    zeroes--;
                }
                l++;

            }
            if(zeroes <= k){
                int length = (r-l+1);
                start = l;
                end = r;
                max_length = Math.max(length, max_length);

            }
        r++;
        }
        System.out.println("The Length is :"+max_length);
        System.out.print("The Subarray is :");
        for(int i=start; i<end; i++){
            System.out.print(nums[i]+" , ");
        }

    }
    public static void Further_optimization(int[] nums,int k){
        int l =0,r=0,zeroes=0,max_length=0;
        int start = 0;
        int end = 0;
    
        while(r<nums.length){
            if (nums[r]==0){
                zeroes++;
            }
            if(zeroes > k){
                if(nums[l]==0){
                    zeroes--;
                }
                l++;

            }
            if(zeroes <= k){
                int length = (r-l+1);
                start = l;
                end = r;
                max_length = Math.max(length, max_length);

            }
        r++;
        }
        System.out.println("The length is:"+max_length);
        System.out.print("SubArray: ");
        for(int i=start; i<end; i++){
            System.out.print(nums[i]+" , ");

        }
        // return max_length;
        
    }
        
    
}
