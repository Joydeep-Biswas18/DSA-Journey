
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Move_zero_to_last_of_Array {

    public static void main(String[] args) {

        long start = System.nanoTime();
        int[] arr = {2, 2, 4, 1, 4, 12, 4, 2, 0, 667, 6, 7, 0, 0, 8, 9, 0, 10};
        int[] result = Move_zero_last_in_arr(arr);
        System.out.println(Arrays.toString(result));
        long end = System.nanoTime();
        System.out.println(end -start);
        
        long start1 = System.nanoTime();
        int [] optimal_result = Move_zero_optimal_sol(arr);
        System.out.println(Arrays.toString(optimal_result));
        long end2 = System.nanoTime();
        System.out.println(end2 - start1);
    }

    //Brute Force Approach
    public static int[] Move_zero_last_in_arr(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        for (int i = list.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    static int[] Move_zero_optimal_sol(int[] nums) {
        //step-01 --> find the first Zero present in array
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;

            }
        }
        // step-02 ----> Now iterate to the remaining array when i gets 0 then it will swap and j is increamented and on the other side i also increamenting
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j] = temp;

                j++;
            }
        }
        return nums;
    }
}
