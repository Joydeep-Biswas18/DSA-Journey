public class Leetcode_125_Valid_Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        
    }
    public static boolean isPalindrome(String s){
        if(s.isEmpty()){
            return true;
        }
        int start = 0;
        int last = s.length()-1;

        //two Pointer Approach
        while(start <= last){
            char FirstChar = s.charAt(start);
            char lastChar = s.charAt(last);
            if(!Character.isLetterOrDigit(FirstChar)){
                start++;
            }
            else if(! Character.isLetterOrDigit(lastChar)){
                last--;
            }
             else {
        		if (Character.toLowerCase(FirstChar) != Character.toLowerCase(lastChar)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
        }
    }

