
public class Leetcode_424_Longest_Repeating_Character_Replacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(longest_Repetitng_Character_Replacement(s, k));
        
    }
    public static int longest_Repetitng_Character_Replacement(String s, int k){
        int l =0;
        int r = 0;
        int max_length =0;
        int max_freq =0;
        int[] hash = new int[26];
       
        while(r<s.length()){
            hash[s.charAt(r) - 'A']++;
            max_freq = Math.max(max_freq, hash[s.charAt(r) - 'A']);

            if(((r-l+1)-max_freq)>k){
                hash[s.charAt(l) - 'A']--;
                l++;
            }
            max_length = Math.max(max_length, r-l+1);

            r++;
        }

        return max_length;

    }
}
