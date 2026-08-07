public class LeetCode_3348 {

    public static void main(String[] args) {
        String n = "123400";
        long t = 256;

        String result = smallestNumber(n, t);
        System.out.println(result);
    }

    public static String smallestNumber(String num, long t) {
        int number = Integer.parseInt(num);

        while (number <=200000) {

            int product = Product(number);

            // Skip numbers containing 0
            if (product == -1) {
                number++;
                continue;
            }

            // Check divisibility
            if (product % t == 0) {
                return String.valueOf(number);
            }

            number++;
        }
        return "-1";
    }

    public static int Product(int number) {
        int temp = number;
        int product = 1;

        while (temp > 0) {
            int digit = temp % 10;

            // Number contains 0
            if (digit == 0) {
                return -1;
            }

            product *= digit;
            temp /= 10;
        }

        return product;
    }
}