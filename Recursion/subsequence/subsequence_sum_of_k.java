import java.util.*;
public class subsequence_sum_of_k {
    public static void main(String[] args) {
        int [] nums ={1,2,1,3,4,7};
        List<List<Integer>> ans = new ArrayList<>();
        subsequence_sum_k(nums, 0,0, 5, new ArrayList<>(), ans);
        System.out.println(ans);
        
    }
    public static void subsequence_sum_k(int[] nums, int index,int currSum, int Targetsum, List<Integer> result, List<List<Integer>> ans){
        
        

        //Base CONDITION
        if(index == nums.length){
            if(currSum==Targetsum){
                ans.add(new ArrayList<>(result));
            }
            return ;
        }
        else{
            //take
            result.add(nums[index]);
            currSum +=nums[index];
            subsequence_sum_k(nums, index+1, currSum,Targetsum, result, ans);

            //BackTrack
            result.remove(result.size()-1);
            //not take
            currSum -=nums[index];
            subsequence_sum_k(nums, index+1, currSum,Targetsum, result, ans);

        }
    }    
}
