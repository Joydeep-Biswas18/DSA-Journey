import java.util.HashMap;
import java.util.HashSet;

public class Leetcode_217_ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,4,6,4,10};
        System.out.println(containDuplicate(nums));


        Solution_optimal obj = new Solution_optimal();
        System.out.println(obj.optimal_approach(nums));
    }
    public static boolean containDuplicate(int [] nums){
        boolean isDuplicate =false;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]==nums[j]){
                    isDuplicate =true;
                    break;
                }
            }
        }
        return isDuplicate;
    }
    
}
class Solution_optimal{
    public boolean optimal_approach(int [] nums){
        boolean isDuplicate = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num :nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num)==2){
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;
        
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0;i < nums.length;i++){
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
}