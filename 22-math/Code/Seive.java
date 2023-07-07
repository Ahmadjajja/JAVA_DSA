public class Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes =  new boolean[n + 1];
        seive(n, primes);
    }
    // false in array means number is prime
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

// n / 2 + n / 3 + n / 5 + n / 7 + ..... p
// n (1 / 2 + 1 / 3 + 1 / 5 + 1 / 7 + .... + last)
// Harmonic progression for primes   log(log N)
// Total time complexity 
// O ( N * log(log N))



// // Space complexity: O(n)