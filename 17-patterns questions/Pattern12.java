// 12.  * * * * *
//       * * * *
//        * * *
//         * *
//          *
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *

public class Pattern12 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int rows = 1; rows <= 2*n; rows++) {
            int spaces = rows <= n ? rows - 1 : 2*n - rows;
            // Adding spaces on the left side
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            int totalCols = rows <= n ? n - rows + 1: rows - n;
            // Adding * at center
            for (int cols = 1; cols <= totalCols; cols++) {
                System.out.print("* ");
            }

            // Adding spaces on the right side
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
