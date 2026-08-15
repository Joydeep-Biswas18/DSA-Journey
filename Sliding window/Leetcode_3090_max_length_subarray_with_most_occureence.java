
import java.util.HashMap;

public class Leetcode_3090_max_length_subarray_with_most_occureence{
    public static void main(String[] args) {
        String name ="bcbbcba";
        System.out.println(max_length(name));

        
    }
    public static int max_length(String s){
        int max_length =0;
        int left=0;
        int right=0;
        HashMap<Character,Integer> map = new HashMap<>();
       while (right < s.length()) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            while (map.get(s.charAt(right))> 2) {

                char value = s.charAt(left);

                map.put(value, map.get(value) - 1);

                if (map.get(value) == 0) {
                    map.remove(value);
                }

                left++;
            }
            max_length = Math.max(max_length,right - left + 1);
            right++;
    }
    return max_length;
}
}