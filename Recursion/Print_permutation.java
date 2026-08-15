
import java.util.ArrayList;
import java.util.List;

public class Print_permutation {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(ListOfArray(nums));


    }

    public static void permute(int[] nums, List<Integer> ds, List<List<Integer>> result, boolean freq[]) {
        if (ds.size() == nums.length) {
            result.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0;i<nums.length;i++)
        
        {
            if (!freq[i]) {
                freq[i]=true;
                ds.add(nums[i]);
                permute(nums,ds,result,freq);
                ds.remove(ds.size()-1);
                freq[i] =false;

            }
        }
    }
    public static List<List<Integer>> ListOfArray(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean [] freq = new boolean[nums.length];
        permute(nums, ds, result, freq);
        return result;


    }

    
}
