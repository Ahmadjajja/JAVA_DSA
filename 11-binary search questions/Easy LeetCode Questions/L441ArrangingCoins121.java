// You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

// Given the integer n, return the number of complete rows of the staircase you will build.

public class L441ArrangingCoins121 {
    public static int arrangeCoins(int n) {
        long start = 0, end = n;
        long mid, currSum;
        while (start <= end) {
            mid = start + (end - start) / 2;
            currSum = mid * (mid + 1) / 2; // currSum will find exactly number of coins needed for making current row
                                           // complete
            if (currSum == n) {
                return (int) mid;
            }
            if (currSum < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) end;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(6));;
    }
}
