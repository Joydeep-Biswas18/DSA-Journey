
import java.util.HashMap;

public class Leetcode_76_Minimum_Window_Substring {

    public static void main(String[] args) {

        String word = "ADOBECODEBANC";
        String target = "ABC";

        System.out.println(Minimum_subtring(word, target));
    }

    public static String Minimum_subtring(String s, String target) {

        int l = 0;
        int r = 0;

        int min_length = Integer.MAX_VALUE;
        int len_target = target.length();
        int count = 0;
        int s_index = -1;
        int end_index = -1;

        HashMap<Character, Integer> map = new HashMap<>();

        // Store the required frequency of characters
        for (char ch : target.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        while (r < s.length()) {

            char ch = s.charAt(r);

            // If current character is required
            if (map.containsKey(ch)) {

                // This character satisfies a requirement
                if (map.get(ch) > 0) {

                    count++;
                }

                // Decrease required frequency
                map.put(ch, map.get(ch) - 1);
            }

            // All characters of target are present
            while (count == len_target) {

                // Update minimum window length
                if (r - l + 1 < min_length) {
                    min_length = r - l + 1;
                    s_index = l;
                }
                char leftChar = s.charAt(l);

                // If left character belongs to target
                if (map.containsKey(leftChar)) {

                    map.put(leftChar, map.get(leftChar) + 1);

                    // We now lost a required character
                    if (map.get(leftChar) > 0) {
                        count--;
                    }
                }

                l++;
                
            }

            r++;
            
        }
        String result = s.substring(s_index, s_index+min_length);

        // No valid window found
        if (min_length == Integer.MAX_VALUE) {
            return "";
        }

        // return min_length;
        return result;
    }
}
