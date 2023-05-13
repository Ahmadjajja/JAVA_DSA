// 24.    *        *
//        **      **
//        * *    * *
//        *  *  *  *
//        *   **   *
//        *   **   *
//        *  *  *  *
//        * *    * *
//        **      **
//        *        *


public class Pattern24 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        int asterisks = 0, midSpace = 0, innerSpace = 0, outerSpace = 0, totalCols = 2*n;
        for (int rows = 1; rows <= 2*n; rows++) {
            if(rows == 1 || rows == 2*n){
                asterisks = 2;
                midSpace = totalCols - asterisks;
                for (int i = 1; i <= asterisks; i++) {
                    System.out.print("*");
                    for (int index = 0; index < midSpace && i != asterisks; index++) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } else {
                asterisks = 4;
                innerSpace = rows <= n ? rows - 2: totalCols - rows - 1;
                outerSpace = totalCols - 4 - 2*innerSpace;

                for (int i = 1; i <= asterisks; i++) {
                    System.out.print("*");
                    if (i == 1 || i == 3) {
                        for (int j = 0; j < innerSpace; j++) {
                            System.out.print(" ");
                        }
                    } else if(i == 2){
                        for (int index = 0; index < outerSpace; index++) {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}