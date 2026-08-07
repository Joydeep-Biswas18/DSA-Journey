
public class Count_no_subarray {

    public static void main(String[] args) {
        int [] arr = {1,1,2,1,1};
        arr = convert(arr);
        int y= Count_subarray(arr, 3);
        int x= Count_subarray(arr, 2);
        System.out.println(y-x); 

    }

    static int[] convert(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }
        return nums;
    }

    static int Count_subarray(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int count = 0;
        int count_ones = 0;
        if(k<0){
            return 0;
        }

        while (r < nums.length) {
            count_ones += nums[r];
            while (count_ones > k) {
                count_ones -= nums[l];
                l = l + 1;

            }
            count = count + (r - l + 1);

            r++;
        }
        return count;
    }
}
