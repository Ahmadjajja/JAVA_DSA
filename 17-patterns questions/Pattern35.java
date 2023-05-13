// 35.    1      1
//        12    21
//        123  321
//        12344321



public class Pattern35 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // numbers on left side
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Adding spaces on center
            for (int j = 0; j < 2*n - 2*i; j++) {
                System.out.print("  ");
            }

            // numbers on left side
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}