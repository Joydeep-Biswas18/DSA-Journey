import java.util.HashSet;

public class Remove_Duplicates {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int [] arr ={12,34,54,65,68,74,78,79,84,85,86,89,90,100};
        
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            set.add(num);
        }
        
        System.out.println(set.size());
        long end = System.nanoTime();
        System.out.println("Time"+(end-start)+"ns");

        long st = System.nanoTime();
        int length = Remove_duplicate(arr);
        System.out.println(length);

        long en = System.nanoTime();
        System.out.println("Time"+(en-st)+"ns");

    }//two Pointer Approach 
    // where atfirst i present at index i=1 and j travers all the element in array to find equivalent or not 
    // if it not found equivalent so it increease i by one and again try to find equivalent one
    public static int Remove_duplicate(int [] nums){
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int i=0;
        for(int j=1; j<n; j++){
            if(nums[j]!=nums[i]){
                nums[i+1]= nums[j];
                i++;

            }
        }
        return i+1;

    }
}
    

