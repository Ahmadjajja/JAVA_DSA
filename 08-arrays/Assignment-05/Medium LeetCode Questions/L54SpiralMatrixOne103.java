import java.util.*;

public class L54SpiralMatrixOne103 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int size = matrix.length * matrix[0].length;
        int top = 0, bottom = matrix.length, left = 0, right = matrix[0].length;  // uses for keeping track of value from each size of matrix
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(list.size() < size){
            for(int i = top; i < bottom; i++){
                if(list.size() == size){ // corner case
                    break;
                }
                if(i == top){  // getting values from top side of matrix
                    for(int index = left; index < right; index++){
                        list.add(matrix[i][index]);
                        if(list.size() == size){ // corner case
                            break;
                        }
                    }
                    continue;
                }

                if(i > top && i < bottom - 1){  // getting values from right side of matrix
                    list.add(matrix[i][right -1]);
                    if(list.size() == size){ // corner case
                        break;
                    }
                }

                if(i == bottom - 1){  // getting values from bottom side of matrix
                    for(int index = right - 1; index >= left; index--){
                        list.add(matrix[i][index]);
                        if(list.size() == size){ // corner case
                            break;
                        }
                    }
                    continue;
                }                
            }
            if(list.size() == size){ // corner case
                break;
            }
            for(int i = bottom -2; i > top; i--){  // getting values from left side of matrix
                list.add(matrix[i][left]);
                if(list.size() == size){ // corner case
                    break;
                }                
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return list;
    }
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(arr));
    }
}
