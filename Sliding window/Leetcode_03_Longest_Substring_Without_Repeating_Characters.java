
import java.util.HashMap;

public class Leetcode_03_Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {
        String sample = "abcabcbb";
        System.out.println(count_length(sample));

    }

    public static int count_length(String s) {
        int l = 0;
        int r = 0;
        int max_length = 0;
        // int length ;
        HashMap<Character, Integer> map = new HashMap<>();

        //While Loop upto nums.length
        while (r < s.length()) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

            //when duplicates are present 
            while (map.get(s.charAt(r)) > 1) {
                char value = s.charAt(l);
                map.put(value, map.get(value) - 1);
                if (map.get(value) == 0) {

                    map.remove(value);
                }
                l++;
            }
            int lenght = r - l + 1;
            max_length = Math.max(max_length, lenght);

            r++;

        }

        return max_length;
    }
}
