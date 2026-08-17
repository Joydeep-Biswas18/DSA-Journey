import java.util.ArrayList;
import java.util.List;

public class count_subsequence_number {
    public static void main(String[] args) {
        int [] nums ={1,2,1};
        System.out.println(Count_no_subsequence(nums, 0, 0, 2, new ArrayList<>()));
        
    }
    public static int Count_no_subsequence(int [] nums , int index, int CurrSum,int Sum , List<Integer> result){

        //Base case
        if(index == nums.length){
            if(CurrSum == Sum){
                return 1;

            }
            return 0;
        }
        else{

            // Take element
            result.add(nums[index]);
            CurrSum +=nums[index];
            int l = Count_no_subsequence(nums, index+1, CurrSum, Sum, result);

            //BackTrack
            result.remove(result.size()-1);
            CurrSum -= nums[index];
            int r = Count_no_subsequence(nums, index+1, CurrSum, Sum, result);


            return l+r;
        }
    }
}
