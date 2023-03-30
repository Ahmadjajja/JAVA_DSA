// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
// return the number of negative numbers in grid.

public class L1351CountNegativeNumbersInSortedMatrix126 {
    public static int countNegatives(int[][] grid) {
        int r = 0, c = grid[0].length - 1, count = 0;
        while(r < grid.length && c >= 0){
            if(grid[r][c] < 0){
                count++;
                if(c != 0){ // corner case
                    c--;
                } else {
                    c = grid[0].length - 1;
                    r++;
                }
            }else {
                c = grid[0].length - 1;
                r++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] arr = {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 },
        };
        System.out.println(countNegatives(arr));
    }
}