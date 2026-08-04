// package Sliding window;

public class longest_subarray {
    public static void main(String[] args) {
        int [] arr ={2,3,4,56,45,234,100,5,65,35,675,86,75,45,76,46,23,4,9};
        long start1 = System.nanoTime();
        int length_brute_Approach = Long_subarray_Brute(arr,450);
        long end1 = System.nanoTime();
        System.out.println(length_brute_Approach);
        System.out.println("Executing Time"+(end1-start1)+"ns");
        
        long start2 = System.nanoTime();
        int length_Sliding_Approach = long_sliding_Approach(arr, 450);
        long end2 = System.nanoTime();
        System.out.println(length_Sliding_Approach);
        System.out.println("Executing Time"+(end2-start2)+"ns");
        
    }
    public static int Long_subarray_Brute(int [] nums , int k){     //its time complexity is very high O(n^2)
        int Max_length =0;
        // int k;  //Sum should be less than k
        for(int i =0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];

                if(sum <k){
                    int length = j-i+1;
                    Max_length=Math.max(Max_length,length);
                }

            }
        }
        return Max_length;
    }

    public static int long_sliding_Approach(int [] nums , int k){

        int l=0;
        int r=0, sum =0;
        int max_length = 0;
        while(r<nums.length){
            sum +=nums[r];
            while(sum>k){
                sum -=nums[l];
                l=l+1;
                // if((r-l+1)<max_length){     // we dont need to further Shrink
                //     break;

                // }
            }
            if(sum < k){
                int length =r-l+1;
                max_length=Math.max(max_length, length);
            }
            r++;

        }
        return max_length;
    }
    
}
