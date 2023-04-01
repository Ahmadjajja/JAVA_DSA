// You are standing at position 0 on an infinite number line. There is a destination at position target.

// You can make some number of moves numMoves so that:

// On each move, you can either go left or right.
// During the ith move (starting from i == 1 to i == numMoves), you take i steps in the chosen direction.
// Given the integer target, return the minimum number of moves required (i.e., the minimum numMoves) to reach the destination.

public class L754ReachaNumber140 {
    public static int reachNumber(int target) {
        target = Math.abs(target);
        int numMoves = 0, sum = 0;
        while(sum < target){
            numMoves++;
            sum += numMoves;
        }
        return (sum - target) % 2 == 0 ? numMoves : numMoves % 2 == 0 ? numMoves + 1: numMoves + 2;
    }
    public static void main(String[] args) {
        System.out.println(reachNumber(4));
    }
}
