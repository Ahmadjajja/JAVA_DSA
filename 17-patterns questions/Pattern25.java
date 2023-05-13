// 25.       *****
//          *   *
//         *   *
//        *   *
//       *****


public class Pattern25 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int rows = 1; rows <= n; rows++) {
            // Adding spaces at start
            for (int i = 0; i < n - rows; i++) {
                System.out.print(" ");
            }

            if (rows == 1 || rows == n) {
                // Adding * at start row and end
                for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }
            } else {
                for (int i = 0; i < 2; i++) {
                    System.out.print("*");
                    if (i == 0) {
                        // Adding spaces at mid
                        for (int j = 0; j < n - 2; j++) {
                            System.out.print(" ");
                        }
                    }
                }

            }
            System.out.println();
        }
    }
}