public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(1011));
    }
    static String palin(int n){
        if (n == rev(n)) {
            return n + " is palindrome";
        }
        return n + " is not palindrome";
    }
    static int rev(int n) {
        // sometimes we might need some additional variable in the argument
        // in that case, make another function
        if (n < 10) {   // n % 10 == n
            return n;
        }
        int digits = (int) Math.log10(n);   // returns (length of digits - 1)
        int base =(n % 10) * (int) Math.pow(10, digits);
        return (base) + rev(n / 10);
    }
}
