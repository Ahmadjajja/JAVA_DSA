// 15.      *
//         * *
//        *   *
//       *     *
//      *       *
//       *     *
//        *   *
//         * *
//          *

public class Pattern15 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        int totalCols = 0;
        for (int rows = 1; rows < 2*n; rows++) {
            int spaces = rows <= n ? n - rows: rows - n;
            // Adding spaces on the left side
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            if (rows == 1 ) {
                totalCols = rows;
            } else {
                totalCols = rows <= n ? totalCols + 2: totalCols - 2;
            }
            // Adding * and spaces at center
            for (int cols = 1; cols <= totalCols; cols++) {
                if (rows == 1 || rows == 2*n - 1) {
                    System.out.print("*");
                    continue;
                }
                if(cols == 1 || cols == totalCols){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            // Adding spaces on the right side
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}