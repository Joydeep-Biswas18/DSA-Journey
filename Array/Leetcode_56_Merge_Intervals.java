
import java.util.*;

class Leetcode_56_Merge_Intervals {

    public static void main(String[] args) {
        int[][] nums = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(merge_subInterval(nums)));
    }

    public static int[][] merge_subInterval(int[][] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));
        int i = 0;
        while (i < nums.length) {
            int start = nums[i][0];
            int end = nums[i][1];

            int j = i + 1;
            while (j < nums.length && nums[j][0] <= end) {
                // Extend the end of current interval
                end = Math.max(end, nums[j][1]);
                j++;
            }
            //add the overlap subInterval
            ans.add(Arrays.asList(start, end));

            //update i
            i = j;  //Because it is stariing from 0 index
        }
        return ans.stream()
                .map(list -> list.stream()
                .mapToInt(Integer::intValue)
                .toArray())
                .toArray(int[][]::new);

    }
}

class optimal_solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast()[1] = Math.max(
                    merged.getLast()[1],
                    interval[1]
                );
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
class solution{
    public static int[][] merge(int [][] nums){
        int n = nums.length;
        Arrays.sort(nums ,(a,b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        
        for(int[] num : nums){
            if(merged.getLast()[1] < num[0] || merged.isEmpty()){
                merged.add(num);

            }
            else{
                merged.getLast()[1] = Math.max(merged.getLast()[1], num[1]);
            }

        }
        return merged.toArray(new int[merged.size()][]);

    }
}

