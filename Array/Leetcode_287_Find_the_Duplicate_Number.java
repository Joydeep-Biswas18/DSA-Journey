public class Leetcode_287_Find_the_Duplicate_Number {
    public static void main(String[] args) {

    }

}

class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] == nums[i]) {
                    result = nums[j];
                }
            }
        }
        return result;

    }
}
class Solution1 {
    public int findDuplicate(int[] nums) {
        
        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(slow != fast);

        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;

    }
}
