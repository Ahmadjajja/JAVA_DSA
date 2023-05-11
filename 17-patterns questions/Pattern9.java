// 9.  *********
//      *******
//       *****
//        ***
//         *

public class Pattern9 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        int totalCols = 0;
        for (int rows = 1; rows <= n; rows++) {
            int spaces = rows - 1;
            // Adding spaces on the left side
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            if (rows == 1) {
                totalCols += (n + n) - rows;
            } else {
                totalCols -= 2;
            }
            // Adding * at center
            for (int cols = 1; cols <= totalCols; cols++) {
                System.out.print("*");
            }

            // Adding spaces on the right side
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}