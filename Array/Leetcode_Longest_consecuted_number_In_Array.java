
import java.util.HashSet;

public class Leetcode_Longest_consecuted_number_In_Array {

    public static void main(String arge[]) {
        int [] nums ={1,1,2,3,5,6,4,7,5,8,100,101,102,103,104};
        System.out.println(Count_longest_consecutive(nums));

        //Brute Force Soluton
        Brute_Solution obj = new Brute_Solution();
        System.out.println(obj.Count_longest_consecutive(nums));

    }

    public static int Count_longest_consecutive(int[] nums) {
        int max_length = 1;
       
        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        for (int num : set) {//Here maiin catch is find the staring element of consecutive numbers to find this set.contains helps us a lot that return only boolean type answer if thr element has previuos any element as starting element so we cheak for furthur element using while loop
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + 1)) {
                    count = count +1 ;
                    num = num +1 ;
                }
                
                max_length = Math.max(max_length , count);
            }
        }
        return max_length;
    }
}
class Brute_Solution {
    public static int Count_longest_consecutive(int [] nums){
        int max_length =1;
        int n = nums.length;

        for(int i =0 ; i< n ; i++){
            int x = nums[i];
            int count = 1;
            while(LenearSearch(nums, x+1) == true){
                x = x+1;
                count ++;
            }
            max_length = Math.max(count , max_length);
        }
        return max_length;
    }
    public static boolean LenearSearch(int [] nums, int k ){
        for( int i =0 ; i<nums.length; i++){
            if(nums[i] ==k){
                return true ;
            }
            
        }
        return false;
    }
}

