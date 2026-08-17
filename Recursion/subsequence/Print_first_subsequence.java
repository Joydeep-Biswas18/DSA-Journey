import java.util.ArrayList;
import java.util.List;

public class Print_first_subsequence {
    public static void main(String[] args) {
        int [] nums ={1,2,1};
        System.out.println(Count_no_subsequence(nums, 0, 0, 2, new ArrayList<>()));
        
    }
    public static boolean Count_no_subsequence(int [] nums , int index, int CurrSum,int Sum , List<Integer> result){

        //Base case
        if(index == nums.length){
            if(CurrSum == Sum){
                System.out.println(result);
                return true;

            }
            return false;
        }
        else{

            // Take element
            result.add(nums[index]);
            CurrSum +=nums[index];
            if(Count_no_subsequence(nums, index+1, CurrSum, Sum, result)==true){
                return true;
            }

            //BackTrack
            result.remove(result.size()-1);
            CurrSum -= nums[index];
            if(Count_no_subsequence(nums, index+1, CurrSum, Sum, result)==true){
                return true;
            }


            return false;
        }
    }
}
