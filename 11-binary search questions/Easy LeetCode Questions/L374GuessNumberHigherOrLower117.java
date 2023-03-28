// We are playing the Guess Game. The game is as follows:

// I pick a number from 1 to n. You have to guess which number I picked.

// Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

// You call a pre-defined API int guess(int num), which returns three possible results:

// -1: Your guess is higher than the number I picked (i.e. num > pick).
// 1: Your guess is lower than the number I picked (i.e. num < pick).
// 0: your guess is equal to the number I picked (i.e. num == pick).
// Return the number that I picked.




public class L374GuessNumberHigherOrLower117 {   
    public static int guessNumber(int n) {
        int start = 0, end = n;
        while(true){
            int mid = start + ( end - start ) / 2;
            int guess = guess(mid);
            if(guess == -1){
                end = mid - 1;
            } else if (guess == 1) {
                start = mid + 1;
            } else if(guess == 0){
                return mid;
            }
        }
    }

    public static int guess(int n) {   // api for guessing number
        int guessingNumber = 6;
        if (n > guessingNumber) {
            return -1;
        } else if (n < guessingNumber){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(9));
    }
}
