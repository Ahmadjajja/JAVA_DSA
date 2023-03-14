import java.util.*;

public class testingQs {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] reshape = new int[r][c];
        if ((mat.length * mat[0].length) != r * c) {
            return mat;
        }
        int row = 0;
        int col = 0;

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                reshape[row][col] =  mat[i][j];
                col++;
                if(col == c){
                    row++;
                    col = 0;
                }
            }
        }        
        return reshape;

        // ArrayList<Integer> list = new ArrayList<Integer>();
        // int matElements = 0;
        // for(int i = 0; i < mat.length; i++){
        //     for(int j = 0; j < mat[i].length; j++){
        //         list.add(mat[i][j]);
        //         matElements++;
        //     }
        // }
        // int[][] reshape = new int[r][(c == 1) ?list.size(): c ];

        // int reshapeElements = 0;
        // for(int i = 0; i < r; i++){
        //     for(int j = 0; j < ((r == 1 && c == 1) ? list.size():c); j++){
        //         if(reshapeElements < matElements){
        //             if (r == 1 && c == 1) {
        //                 reshape[i][reshapeElements] = list.get(reshapeElements++);
        //             } else {
        //                 reshape[i][j] = list.get(reshapeElements++);
        //             }
        //         } else {
        //             return mat;
        //         }
        //     }
        // }  
        // System.out.println("reshapeElements "+ reshapeElements);
        // System.out.println("matElements "+ matElements);
        // System.out.println("list.size() "+ list.size());

        // return mat;      
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2}};
        for (int index = 0; index < matrixReshape(arr, 1, 1).length; index++) {
            System.out.println(Arrays.toString(matrixReshape(arr, 1, 1)[index]));
        }
        
    }
}
