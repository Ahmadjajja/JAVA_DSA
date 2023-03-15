import java.util.*;

public class L59SpiralMatrixTwo104 {
    public static int[][] spiralOrder(int n) {
        int[][] matrix = new int[n][n]; 
        int size = n * n, count = 0;
        int top = 0, bottom = matrix.length, left = 0, right = matrix[0].length;  // uses for keeping track of value from each size of matrix

        while(count < size){
            for(int i = top; i < bottom; i++){
                if(count == size){ // corner case
                    break;
                }
                if(i == top){  // setting values to the top side of matrix
                    for(int index = left; index < right; index++){
                        matrix[i][index] = ++count;
                        if(count == size){ // corner case
                            break;
                        }
                    }
                    continue;
                }

                if(i > top && i < bottom - 1){  // setting values to the right side of matrix
                    matrix[i][right -1] = ++count;
                    if(count == size){ // corner case
                        break;
                    }
                }

                if(i == bottom - 1){  // setting values to the bottom side of matrix
                    for(int index = right - 1; index >= left; index--){
                        matrix[i][index] = ++count;
                        if(count == size){ // corner case
                            break;
                        }
                    }
                    continue;
                }                
            }
            if(count == size){ // corner case
                break;
            }
            for(int i = bottom -2; i > top; i--){  // setting values to the left side of matrix
                matrix[i][left] = ++count;
                if(count == size){ // corner case
                    break;
                }                
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return matrix;
    }
    public static void main(String[] args) {
        for (int i = 0; i < spiralOrder(3).length; i++) {
            System.out.println(Arrays.toString(spiralOrder(3)[i]));
        }
    }
}
