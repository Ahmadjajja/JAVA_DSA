public class SumOfDigitsOfNumbers{
    public static void main(String[] args) {
        // System.out.println(sumOfDigts(45632, 0));
        System.out.println(sumOfDigts2(45632));
    }
    // public static int sumOfDigts(int n, int sum){
    //     if (n == 0) {
    //         return sum;
    //     }
    //     sum += n % 10;
    //     n /= 10;
    //     return sumOfDigts(n, sum);
    // }
    public static int sumOfDigts2(int n){
        if (n == 0) {
            return 0;
        }
        return ((n % 10) + sumOfDigts2(n / 10));
    }
}