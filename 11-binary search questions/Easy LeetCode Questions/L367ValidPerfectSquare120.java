// Given a positive integer num, return true if num is a perfect square or false otherwise.

// A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

// You must not use any built-in library function, such as sqrt.

public class L367ValidPerfectSquare120 {
    public static boolean isPerfectSquare(int num) {
        int start = 0, end = num;
        long mid = start + (end - start) / 2;
        boolean ans = false;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((mid * mid) > num) {
                end = (int) (mid - 1);
            } else if ((mid * mid) < num) {
                if (((mid + 1) * (mid + 1) > num)) {
                    ans = false;
                    break;
                } else {
                    start = (int) (mid + 1);
                }
            } else {
                ans = true;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
}
