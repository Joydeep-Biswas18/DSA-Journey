import java.util.ArrayList;
import java.util.List;

public class Leetcode_77_Combinations{
    public static void main(String[] args) {
        
    }
    public static List<List<Integer>> All_combintion(int[] nums , int index , int k, List<Integer> ds ){
        List<List<Integer>> ans = new ArrayList<>();

        //Base case 
        if(index == nums.length){
            if(ds.size()==k){
                ans.add(ds);

            }
            return ans;
        }
        else()



    }
}