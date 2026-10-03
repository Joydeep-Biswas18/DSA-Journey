import java.util.Stack;

public class Leetcode_32_Longest_Valid_Parentheses {
    public static void main(String[] args) {
        String s = "(()";
        System.out.println(Longest_valid_parenthesis(s));

    }

    public static int Longest_valid_parenthesis(String s) {
        int final_len = 0;
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            // if (s.charAt(0) == ')') {
                // continue;
                // }
                int length_last = 0;

            if(ch == '(') {
                st.push(ch);
            }
            while (!st.isEmpty() && ch == ')') {
                st.pop();
                length_last++;
            }
            final_len = Math.max(length_last * 2,final_len);

        }
        return final_len;
    }
}
