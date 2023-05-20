// Amazon level question

public class MagicNumber {
    public static void main(String[] args) {
        int n = 2;

        int ans = 0;
        int base = 5;
        // Question ? How many times loop here running ?
        // Answer   ? It's obviously running the number of times there are bits in the number
        while (n > 0) {
            int last = n & 1;   // gets last digit in binary representation
            n = n >> 1;         // remove last digit in binary representation
            ans += last * base; // answer after each iteration
            base = base * 5;    // base increasing after each iteration
        }

        System.out.println(ans);
    }
}
