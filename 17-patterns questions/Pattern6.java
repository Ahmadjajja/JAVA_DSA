// 6.       *
//         **
//        ***
//       ****
//      *****

public class Pattern6 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int rows = 1; rows <= n; rows++) {
            int spaces = n - rows;

            for (int space = 1; space <= spaces; space++) {
                System.out.print("  ");
            }

            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}