// 23.        *     *  
//           * *   * *
//          *   * *   *
//         *     *     *

// Very Interesting pattern

public class Pattern23 {
    public static void main(String[] args) {
        pattern(10);
    }

    static void pattern(int n) {
        int cols = (n * 4) - 3, leftRightSpaces = 0, midSpaces = 0, innerSpaces = 0, outerSpaces = 0, asterisks = 0;
        for (int rows = 1; rows <= n; rows++) {
            if (rows == 1) {
                leftRightSpaces = n - 1;
                midSpaces = cols - (leftRightSpaces * 2) - 2;
                asterisks = 2;
            } else if (rows == n) {
                leftRightSpaces = 0;
                midSpaces = (cols - 3) / 2;
                asterisks = 3;
            }else {
                leftRightSpaces = n - rows;
                asterisks = 4;
                if (rows == 2) {
                    innerSpaces = 1;
                    outerSpaces = cols - (2 * leftRightSpaces) - (2 * innerSpaces) - 4;
                } else {
                    innerSpaces += 2;
                    outerSpaces -= 2;
                }
                // Spaces on left
                for (int i = 0; i < leftRightSpaces; i++) {
                    System.out.print(" ");
                }
                // asterisks, innerSpaces and outer Spaces
                for (int i = 0; i < asterisks; i++) {
                    System.out.print("*");
                    if (i == 0 || i == 2) {
                        for (int j = 0; j < innerSpaces; j++) {
                            System.out.print(" ");
                        }
                    } else if (i == 1) {
                        for (int j = 0; j < outerSpaces; j++) {
                            System.out.print(" ");
                        }
                    }
                }
                // Spaces on right
                for (int i = 0; i < leftRightSpaces; i++) {
                    System.out.print(" ");
                }   
                System.out.println();             
                continue;
            }
            // Spaces on left
            for (int i = 0; i < leftRightSpaces; i++) {
                System.out.print(" ");
            }
            // asterisks, midSpaces
            for (int i = 0; i < asterisks; i++) {
                System.out.print("*");
                if (i == asterisks - 1) {
                    continue;
                }
                for (int j = 0; j < midSpaces; j++) {
                    System.out.print(" ");
                }
            }
            // Spaces on right
            for (int i = 0; i < leftRightSpaces; i++) {
                System.out.print(" ");
            }                           
            System.out.println();
        }
    }
} 