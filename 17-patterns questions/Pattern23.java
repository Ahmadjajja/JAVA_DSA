// 23.        *     *  
//           * *   * *
//          *   * *   *
//         *     *     *

public class Pattern23 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        for (int rows = 1; rows <= n; rows++) {
            int leftRightSpace = n - rows;
            int midSpace = rows == n ? n : rows == 1 ? 3 : rows - 1;
            int asterisks = rows == n ? 3: rows == 1 ? 2 : 4;
            // spaces at start
            for (int i = 0; i < leftRightSpace; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < asterisks; i++) {
                System.out.print("*");
                if (i != asterisks - 1) {
                    for (int j = 0; j < midSpace; j++) {
                        System.out.print(" ");
                    }
                }
            }
            // spaces at end
            for (int i = 0; i < leftRightSpace; i++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
} 