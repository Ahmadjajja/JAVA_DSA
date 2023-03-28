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
