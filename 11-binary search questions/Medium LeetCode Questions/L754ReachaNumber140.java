// You are standing at position 0 on an infinite number line. There is a destination at position target.

// You can make some number of moves numMoves so that:

// On each move, you can either go left or right.
// During the ith move (starting from i == 1 to i == numMoves), you take i steps in the chosen direction.
// Given the integer target, return the minimum number of moves required (i.e., the minimum numMoves) to reach the destination.

public class L754ReachaNumber140 {
    public static int reachNumber(int target) {

        // Brute-force approach

        // target = Math.abs(target);
        // int numMoves = 0, sum = 0;
        // while(sum < target){
        //     numMoves++;
        //     sum += numMoves;
        // }
        // return (sum - target) % 2 == 0 ? numMoves : numMoves % 2 == 0 ? numMoves + 1: numMoves + 2;

        // O(log(n))   Binary Search
        target = Math.abs(target);
        System.out.println(target);
        int start = 1, end = Math.abs(target), ans = 1;
        long sum = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            sum = (long) mid * (mid + 1) / 2;
            mid = start + (end - start) / 2;
            if (sum == target) {
                ans = mid;
                break;
            }
            if (sum < target) {
                start = mid + 1;
            } else {
                int diff = (int) (sum - target);
                ans = (diff % 2 == 0) ? mid : mid + ((mid % 2 == 0) ? 1 : 2);
                end = mid - 1; 
            }
            sum = 0;
        }
        return ans;

    }
    public static void main(String[] args) {
        // System.out.println(reachNumber(1000000000));
        // System.out.println(reachNumber(11));
        System.out.println(reachNumber(-1000000000));
    }
}
