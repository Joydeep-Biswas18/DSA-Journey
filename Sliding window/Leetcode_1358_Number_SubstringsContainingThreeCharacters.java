// Input: s = "abcabc"
// Output: 10
// Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).z

public class Leetcode_1358_Number_SubstringsContainingThreeCharacters{
    public static void main(String[] args) {
        String sample ="bbacba";
        System.out.println(numberOfSubstrings(sample)   );
        
    }
    public static int numberOfSubstrings(String s){
        int l=0;
        int r =0;
        int count =0;

        int [] target = new int [3];

        while(r<s.length()){
            target[s.charAt(r) - 'a']++;

            while(target[0]>0 && target[1]>0 && target[2]>0){
                count +=(s.length()-r);
                target[s.charAt(l)-'a']--;
                l++;

            }
            r++;

        }
        return count;
    }
}