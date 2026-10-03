public class Leetcode_3498_Reverse_Degree_of_a_String {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println((int)s.charAt(0));
        System.out.println(Reverse_degree(s));
    }
    public static int Reverse_degree(String s){
        int sum =0;
        int index_value =0;
        for(int i =0; i<s.length();i++){
            int value = 'z'- s.charAt(i) +1;
            index_value = value * (i+1);
            sum += index_value;

        }
        return sum;
    }
}
