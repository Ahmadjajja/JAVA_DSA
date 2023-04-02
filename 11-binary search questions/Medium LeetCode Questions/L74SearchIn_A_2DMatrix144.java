// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.


public class L74SearchIn_A_2DMatrix144 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0 , col = matrix[0].length - 1;
        while(row < matrix.length){
            if(matrix[row][col] < target){
                row++;
            } else {
                int start = 0, end = col;
                while(start <= end){
                    int mid = start + (end - start) / 2;
                    if(matrix[row][mid] == target){
                        return true;
                    }
                    if(matrix[row][mid] > target){
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        System.out.println(searchMatrix(arr, 23));
    }
}
