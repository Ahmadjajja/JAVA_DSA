// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

// You must not use any built-in exponent function or operator.

// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

// In other words, the square root of x is the value that, when multiplied by itself, results in x. 

public class L69Sqrt116 {
    public static int mySqrt(int x) {
        int start = 0, end = x;
        long mid = start + (end - start) / 2;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((mid * mid) > x) {
                end = (int) (mid - 1);
            } else if ((mid * mid) < x) {
                if (((mid + 1) * (mid + 1) > x)) {
                    return (int) mid;
                } else {
                    start = (int) (mid + 1);
                }
            } else {
                return (int) mid;
            }
        }
        return start;

    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}