import java.util.*;
public class Leetcode_503_Next_greater_ele_ii {
    public static void main(String[] args) {
        int [] nums = {2,10,12,1,11};
        int [] ans = nge_two(nums);
        System.out.println(Arrays.toString(ans));
        
    }
    //Brute Force with 0(n^2) Beacuse of two for loops i should to optimize it 
    public static int[] nge_II(int [] nums ){
        int n = nums.length;
        int[] result= new int[n];
        Arrays.fill(result, -1);
        for(int i =0; i<n;i++){
            for(int j =i+1;j<i+n; j++){
                int ind = j%n;
                if(nums[ind]>nums[i]){
                    result[i] = nums[ind];
                    break;
                }
            }
        }
        return result;
    }
    public static int[] nge_two(int [] nums){
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 2*n-1 ; i>=0; i--){
            while(! st.isEmpty() && st.peek()<= nums[i%n]){
                st.pop();
            }
            if(i<n){
                result[i] = st.isEmpty()? -1 : st.peek();
            }
            st.push(nums[i%n]);
        }
        return result;
    }
}
