
import java.util.Arrays;
import java.util.HashMap;

public class Two_sum_optimal {
    public static void main(String[] args) {
        int [] arr = {2,3,45,23,5,67,3,200};
        System.out.println(Arrays.toString(two_sum(arr, 245)));

        
    }
    public static int [] two_sum(int [] nums , int target){
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int []{
                    map.get(complement), i
                };

            }
            map.put(nums[i], i);
        }
        return new int []{};
    }
}
