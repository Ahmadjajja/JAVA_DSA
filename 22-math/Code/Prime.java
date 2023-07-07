public class Prime {
    public static void main(String[] args) {
        for (int i = 2; i < 40; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is Prime Number.");
            }
        }
    }
    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        int c = 2;
//      c * c used in place of c because
//   . . . . . . . . . ..
//   .  1 * 36  =   36  .
//   .  2 * 18  =   36  .
//   .  4 * 12  =   36  . 
//   .  6 *  9  =   36  .
//   .  6 *  6  =   36  .
//   . . . . . . . . . .. 
//      9 *  4  =   36
//      12 * 3  =   36
//      18 * 2  =   36
//      36 * 1  =   36
//      
//      Some checks are repeating that's why only run loop through
//      Square root of the number, so eliminated repeated checks
//      So time complexity reduces to Square root of the number.
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}

// time complexity = n * SquareRoot(n)