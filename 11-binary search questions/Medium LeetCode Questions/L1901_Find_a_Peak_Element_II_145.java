import java.util.Arrays;

// A peak element in a 2D grid is an element that is strictly greater than all of its adjacent neighbors to the left, right, top, and bottom.

// Given a 0-indexed m x n matrix mat where no two adjacent cells are equal, find any peak element mat[i][j] and return the length 2 array [i,j].

// You may assume that the entire matrix is surrounded by an outer perimeter with the value -1 in each cell.

// You must write an algorithm that runs in O(m log(n)) or O(n log(m)) time.

public class L1901_Find_a_Peak_Element_II_145 {
    public static int[] findPeakGrid(int[][] mat) {

        // // Approach 1   - worst case scenario - O (n * m)

        // int row = 0, col = mat[0].length - 1;
        // while (row < mat.length) {
        //     // System.out.println("col :" + col);
        //     while (col >= 0) {
        //         // System.out.println("row :" + row + " col :" + col);
        //         // System.out.println("case 1");
        //         // case - 1
        //         if (mat.length == 1 && mat[0].length == 1) {
        //             return new int[] { 0, 0 };
        //         }
        //         // System.out.println("case 2");
        //         // case - 2
        //         if (row == 0 && col == mat[0].length - 1) {
        //             if (mat[row][col] > mat[row + 1][col] && mat[row][col] > mat[row][col - 1]
        //                     ) {
        //                 return new int[] { row, col };
        //             } else {
        //                 col--;
        //                 continue;
        //             }
        //         }
        //         // System.out.println("case 3");
        //         // case - 3
        //         if (row == 0 && col == 0) {
        //             if (mat[row][col] > mat[row + 1][col] && mat[row][col] > mat[row][col + 1]
        //                     ) {
        //                 return new int[] { row, col };
        //             } else {
        //                 col--;
        //                 continue;
        //             }
        //         }
        //         // System.out.println("case 4");
        //         // case - 4
        //         if (row == mat.length - 1 && col == 0) {
        //             if (mat[row][col] > mat[row - 1][col] && mat[row][col] > mat[row][col + 1]
        //                     ) {
        //                 return new int[] { row, col };
        //             } else {
        //                 col--;
        //                 continue;
        //             }
        //         }
        //         // System.out.println("case 5");
        //         // case - 5
        //         if (row == mat.length - 1 && col == mat[0].length - 1) {
        //             if (mat[row][col] > mat[row - 1][col] && mat[row][col] > mat[row][col - 1]
        //                     ) {
        //                 return new int[] { row, col };
        //             } else {
        //                 col--;
        //                 continue;
        //             }
        //         }
        //         // System.out.println("case 6");
        //         // case - 6
        //         if (row == 0) {
        //             // System.out.println("hey");
        //             if (mat[row][col] > mat[row + 1][col] && mat[row][col] > mat[row][col - 1]
        //                     && mat[row][col] > mat[row][col + 1] ) {
        //                 return new int[] { row, col };
        //             } else {
        //                 col--;
        //                 continue;
        //             }
        //         }
        //         // System.out.println("case 7");
        //         // case - 7
        //         if (row == mat.length - 1) {
        //             if (mat[row][col] > mat[row - 1][col] && mat[row][col] > mat[row][col - 1]
        //                     && mat[row][col] > mat[row][col + 1] ) {
        //                 return new int[] { row, col };
        //             } else {
        //                 col--;
        //                 continue;
        //             }
        //         }
        //         // System.out.println("case 8");
        //         // case - 8
        //         if (col == 0) {
        //             if (mat[row][col] > mat[row - 1][col] && mat[row][col] > mat[row + 1][col]
        //                     && mat[row][col] > mat[row][col + 1] ) {
        //                 return new int[] { row, col };
        //             } else {
        //                 col--;
        //                 continue;
        //             }
        //         }
        //         // System.out.println("case 9");
        //         // case - 9
        //         if (col == mat[0].length - 1) {
        //             if (mat[row][col] > mat[row - 1][col] && mat[row][col] > mat[row + 1][col]
        //                     && mat[row][col] > mat[row][col - 1] ) {
        //                 return new int[] { row, col };
        //             } else {
        //                 col--;
        //                 continue;
        //             }
        //         }
        //         // System.out.println("case 10");
        //         // case - 10
        //         if (mat[row][col] > mat[row - 1][col] && mat[row][col] > mat[row + 1][col]
        //                 && mat[row][col] > mat[row][col + 1] && mat[row][col] > mat[row][col - 1]) {
        //             return new int[] { row, col };
        //         }
        //         col--;
        //     }
        //     col = mat[0].length - 1;
        //     row++;
        // }

        // return new int[] { -1, -1 };

        // Best - case scenario - O(m * log(n))

        int m = mat.length;
        int n = mat[0].length;
        int left = 0, right = m-1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int maxIndex = 0;

            for (int i = 1; i < n; i++) {
                if (mat[mid][i] > mat[mid][maxIndex]) {
                    maxIndex = i;
                }
            }

            if (mid > 0 && mat[mid-1][maxIndex] > mat[mid][maxIndex]) {
                right = mid - 1;
            } else if (mid < m-1 && mat[mid+1][maxIndex] > mat[mid][maxIndex]) {
                left = mid + 1;
            } else {
                return new int[] {mid, maxIndex};
            }
        }

        return new int[] {-1, -1};

    }

    public static void main(String[] args) {
        // int[][] arr = { // test - case - 1
        //         { 1, 2 },
        //         { 3, 2 }
        // };
        int[][] arr = { // test - case - 2
        {10,20,15},
        {21,30,14},
        {7,16,32},
        };

        System.out.println(Arrays.toString(findPeakGrid(arr)));
    }
}
