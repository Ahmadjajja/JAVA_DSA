public class Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes =  new boolean[n + 1];
        seive(n, primes);
    }
    // false in array means number is prime

    // Visualization of idea is :
    // All these indices of array are false by default.
    // Making each prime number's next multiple indices
    // to true because they all are not prime number (actuall, we are reducing time complexity in this way)
    //
    //      O  O  X  O  X  O  X  X X            O -> False
    //      2  3  4  5  6  7  8  9 10           X -> True
    //
    //  O  X  O  X  X  X  O  X  O  X
    //  11 12 13 14 15 16 17 18 19 20
    //
    //  X  X  O  X  X  X  X  X  O  X
    //  21 22 23 24 25 26 27 28 29 30
    //
    //  O  X  X  X  X  X  O  X  X  X
    //  31 32 33 34 35 36 37 38 39 40
    //
    //
    static void seive(int n, boolean[] primes){
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                // we are just making each prime number's next multiple true
                // because these are not prime numbers
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true; 
                }
            }
        }
        System.out.println("Prime numbers are : ");
        for (int i = 2; i < primes.length; i++) {
            if (!primes[i]) {
                System.out.print(i + " " );
            }
        }
    }
}

// // Time complexity : 

// n / 2 + n / 3 + n / 5 + n / 7 + ..... p (Highest prime number less than n)
// n (1 / 2 + 1 / 3 + 1 / 5 + 1 / 7 + .... + last)
// Harmonic progression for primes   log(log N)
// Total time complexity 
// O ( N * log(log N))



// // Space complexity: O(n)
