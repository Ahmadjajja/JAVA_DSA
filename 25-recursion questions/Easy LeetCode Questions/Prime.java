public class Prime {
    public static void main(String[] args) {
        System.out.println(prime(13, 2));
    }

    private static boolean prime(int n, int i) {
        if (n < 1) {
            return false;
        }
        if (n == 1 || n == 2) {
            return true;
        }
        if (i * i > n) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return prime(n, ++i);
    }
}
