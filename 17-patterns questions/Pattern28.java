// 28.      *
//         * *
//        * * *
//       * * * *
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *



public class Pattern28 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        for (int rows = 1; rows <= n; rows++) {
            int spaces = n - rows;
            // Adding spaces on the left side
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            // Adding * at center
            for (int cols = 1; cols <= rows; cols++) {
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