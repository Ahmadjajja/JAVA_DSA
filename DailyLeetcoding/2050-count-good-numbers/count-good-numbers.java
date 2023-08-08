// Bad solution
class Solution {
    // Public long MOD = 1_000_000_007;
    public static int MOD=(int)1e9+7;
    public int countGoodNumbers(long n) {
        long even = n % 2 == 0 ? (n / 2): (n / 2) + 1;
        long prime = n / 2;
        long evens = pow(5, even) % MOD;
        long primes = pow(4, prime) % MOD;
        long ans = 1;
        ans = (ans * evens) % MOD;
        if(prime != 0){
            ans = (ans * primes) % MOD;
        }
        return (int) (ans % MOD);
        
    }
    private static long pow(long x, long y){
        if(y == 0){
            return 1;
        }
        long temp = pow(x, y / 2);
        return y % 2 == 0 ? (temp * temp) % MOD :( x * temp * temp) % MOD;
    }
}