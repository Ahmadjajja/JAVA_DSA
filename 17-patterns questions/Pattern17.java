// 17.      1
//         212
//        32123
//       4321234
//        32123
//         212
//          1

public class Pattern17 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        int totalCols = 0;
        for (int rows = 1; rows < 2*n; rows++) {
            int spaces = rows <= n ? n - rows : rows - n;

            // Adding spaces on the left side
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            if (rows == 1) {
                totalCols += rows;
            } else {
                // totalCols += 2;
                totalCols = rows <= n ? totalCols + 2: totalCols - 2;
            }
            // Adding numbers at desired place
            int halfC = totalCols / 2 + 1;
            for (int fInd = halfC; fInd > 1; fInd--) {
                System.out.print(fInd);
            }
            System.out.print(1);
            for (int lInd = 2; lInd <= halfC; lInd++) {
                System.out.print(lInd);
            }

            // Adding spaces on the right side
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}