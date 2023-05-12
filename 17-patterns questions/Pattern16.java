// 16.           1
//             1   1
//           1   2   1
//         1   3   3   1
//       1   4   6   4   1

// This pattern is called Pascal's Triangle. Each number in the triangle is the sum of the two numbers above it. 
// The first and last numbers in each row are always 1.



public class Pattern16 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        int[][] matrix = new int[n][n];
        for (int rows = 1; rows <= n; rows++) {
            int spaces = n - rows;
            // Adding spaces on the left side
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            // Adding * at center
            for (int cols = 1; cols <= rows; cols++) {
                if (cols == 1 || cols == rows) {
                    System.out.print("1" + " ");
                    matrix[rows - 1][cols - 1] = 1; // rows -1 & cols - 1 used here because rows and cols start from 1.
                } else {
                    System.out.print((matrix[rows - 2][cols - 1] + matrix[rows - 2][cols - 2]) + " ");
                    matrix[rows - 1][cols -1] = matrix[rows - 2][cols - 1] + matrix[rows - 2][cols - 2];
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