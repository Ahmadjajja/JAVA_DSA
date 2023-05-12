// 18.   **********
//       ****  ****
//       ***    ***
//       **      **
//       *        *
//       *        *
//       **      **
//       ***    ***
//       ****  ****
//       **********

public class Pattern18 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int rows = 1; rows <= 2*n; rows++) {
            int spaces = rows <= n ? 2 * (rows - 1): (2*n - rows) * 2;

            int asterisks = (2*n - spaces) / 2;

            // printing * on left side
            for (int asterisk = 1; asterisk <= asterisks; asterisk++) {
                System.out.print("*");
            }
            // printing spaces on mid
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            // printing * on right side
            for (int asterisk = 1; asterisk <= asterisks; asterisk++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}