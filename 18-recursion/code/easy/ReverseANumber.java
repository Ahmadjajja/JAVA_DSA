public class ReverseANumber {
    private static int reverseANumber1(int i) {
        if (i < 10) {
            return i;
        }
        int temp = i;
        int base = 1;
        while (temp > 10) {
            temp /= 10;
            base *= 10;
        }
        // return Integer.valueOf(new StringBuilder(String.valueOf(i % 10)).append(String.valueOf(reverseANumber(i / 10))).toString());
        return ((i % 10) * base) + reverseANumber1(i / 10);
    }
    static int sum = 0;
    static void reverseANumber2(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseANumber2(n / 10);
    }
    static int reverseANumber3(int n) {
        // sometimes we might need some additional variable in the argument
        // in that case, make another function
        if (n < 10) {   // n % 10 == n
            return n;
        }
        int digits = (int) Math.log10(n);   // returns (length of digits - 1)
        int base =(n % 10) * (int) Math.pow(10, digits);
        return (base) + reverseANumber3(n / 10);
    }
    public static void main(String[] args) {
        // System.out.println(reverseANumber1(53324));
        // reverseANumber2(53324);
        // System.out.println(sum);
        System.out.println(reverseANumber3(53324));
    }

}
