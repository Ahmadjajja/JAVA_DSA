// You start at the cell (rStart, cStart) of an rows x cols grid facing east. The northwest corner is at the first row and column in the grid,
//  and the southeast corner is at the last row and column.

// You will walk in a clockwise spiral shape to visit every position in this grid. Whenever you move outside the grid's boundary, we continue
//  our walk outside the grid (but may return to the grid boundary later.). Eventually, we reach all rows * cols spaces of the grid.

// Return an array of coordinates representing the positions of the grid in the order you visited them.


import java.util.*;

public class L73SetMatrixZeroes106 {
        public static int[][] setZeroes(int[][] matrix) {
            ArrayList<int[]> list = new ArrayList<int[]>();
            // Checking elements that contains 0 value
            for(int i = 0; i < matrix.length; i++){
                for(int index = 0; index < matrix[0].length; index++){
                    if(matrix[i][index] == 0){
                        list.add(new int[]{i, index});
                    }
                }
            }
    
            
            for(int indices = 0; indices < list.size(); indices++){
                // setting 0's at all elements of required rows
                for(int i = 0; i < matrix.length; i++){
                    int[] innerArray = (int[]) list.get(indices);
                    if(innerArray[0] == i){
                        for(int index = 0; index < matrix[0].length; index++){
                            matrix[i][index] = 0;
                        }
                    }
                }
                // setting 0's at all elements of required columns
                for(int i = 0; i < matrix.length; i++){
                    int[] innerArray = (int[]) list.get(indices);
                    matrix[i][innerArray[1]] = 0;
                }
            }
            return matrix;
        }
    

    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(setZeroes(arr)[i]));
        }
    }
}
