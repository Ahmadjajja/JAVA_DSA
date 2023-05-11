// 7.   *****
//       ****
//        ***
//         **
//          *

public class Pattern7 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int rows = 1; rows <= n; rows++) {
            int spaces = rows - 1;

            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            
            int totalCols = n - rows + 1;

            for (int cols = 1; cols <= totalCols; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}