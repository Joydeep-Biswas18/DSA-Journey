

import java.util.*;
public class Print_Subsequence_array {
    public static void main(String[] args) {
        int [] nums ={3,1,2};
        // power_set(nums, 0, new ArrayList<>());

        solution_2nd obj = new solution_2nd();
        List<List<Integer>> ans = new ArrayList<>();
        obj.subsequence(nums, 0, new ArrayList<>(), ans);
        System.out.println(ans);
        
    }
    public static void power_set(int [] nums ,int index ,ArrayList<Integer> result){
        
        if(index >= nums.length){
            System.out.println(result);
            return;
        }
        else{
            //take the element
            result.add(nums[index]);
            power_set(nums, index+1,result);

            //remove the element
            result.remove(result.size()-1);
            power_set(nums, index+1, result);


        }

    }
}

class solution_2nd{
    public void subsequence(int[] nums,int index, ArrayList<Integer> result , List<List<Integer>> ans){
        //base condition
        if(index >= nums.length){
            ans.add(new ArrayList<>(result) );
            return;
        }
        // else if(result.isEmpty()){
        //     System.out.println("{}");
        // }
        else{
            //take element
            result.add(nums[index]);
            subsequence(nums, index+1, result, ans);    

            //backtrack
            result.remove(result.size()-1);
            subsequence(nums, index+1, result, ans);
        }
    }
}