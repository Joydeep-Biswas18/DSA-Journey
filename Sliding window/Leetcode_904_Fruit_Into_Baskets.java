import java.util.HashMap;

public class Leetcode_904_Fruit_Into_Baskets {
    public static void main(String[] args) {
        int[] nums = { 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4 };
        System.out.println(Max_fruit(nums));

    }

    public static int Max_fruit(int[] nums) {
        int max_fruit = Integer.MIN_VALUE;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        while (r < n) {
            map.put(nums[r], map.getOrDefault(nums[r] ,0 )+ 1);
            while (map.size() > 2) {

                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);

                }
                l++;

            }
            int length = r - l + 1;
            max_fruit = Math.max(length, max_fruit);

            r++;

        }
        return max_fruit;

    }
}
