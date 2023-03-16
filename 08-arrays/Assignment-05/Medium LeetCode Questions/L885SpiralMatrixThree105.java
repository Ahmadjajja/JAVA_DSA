// You start at the cell (rStart, cStart) of an rows x cols grid facing east. The northwest corner is at the first row and column in the grid,
//  and the southeast corner is at the last row and column.

// You will walk in a clockwise spiral shape to visit every position in this grid. Whenever you move outside the grid's boundary, we continue
//  our walk outside the grid (but may return to the grid boundary later.). Eventually, we reach all rows * cols spaces of the grid.

// Return an array of coordinates representing the positions of the grid in the order you visited them.


import java.util.*;

public class L885SpiralMatrixThree105 {
    public static int[][] spiralOrder(int rows, int cols, int rStart, int cStart) {
        int size = rows * cols;
        int[][] matrix = new int[size][2];
        int i = rStart, j = cStart;
        ArrayList<int[]> result = new ArrayList<>();
        result.add(new int[] { i, j });
        int diri = 0, dirj = 1;
        int totalCells = 1;
        int twiceCounter = 2;
        int nextRoundTotalCells = 2;
        while (result.size() < size) {
            i += diri;
            j += dirj;
            if ((0 <= i && i < rows) && (0 <= j && j < cols)) {
                result.add(new int[] { i, j });
            }
            totalCells--; // 1 - 1 = 0
            if (totalCells == 0) {
                int temp = diri;
                diri = dirj;
                dirj = -temp;
                twiceCounter--; // 2 - 1 = 1 -1 = 0
                if (twiceCounter == 0) {
                    twiceCounter = 2;
                    totalCells = nextRoundTotalCells;
                    nextRoundTotalCells++; // 3
                } else {
                    totalCells = nextRoundTotalCells - 1; // 2- 1 = 1
                }
            }
        }
        for (int k = 0; k < result.size(); k++) {
            matrix[k] = result.get(k);
        }
        return matrix;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5*6; i++) {
            System.out.println(Arrays.toString(spiralOrder(5, 6, 1, 4)[i]));
        }
    }
}
