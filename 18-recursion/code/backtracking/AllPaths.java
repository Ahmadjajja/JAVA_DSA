import java.util.Arrays;

public class AllPaths{
    public static void main(String[] args) {
        
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        // allPaths("", board, 0, 0);
        allPathsPrint("", board, 0, 0, path, 1);
    }
    private static void allPaths(String p,boolean[][] maze, int r, int c){
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPaths(p + "D",maze , r + 1, c);
        } 
        if (c < maze[0].length - 1)  {
            allPaths(p + "R",maze , r, c + 1);
        }
        if (r > 0)  {
            allPaths(p + "L",maze , r - 1, c);
        }
        if (c > 0)  {
            allPaths(p + "U",maze , r, c - 1);
        }

        // this line is where the function will be over, 
        // so before the function gets removed, also 
        // remove the changes that were made by that function
        maze[r][c] = true;  // (This is backtracking)
    }
    private static void allPathsPrint(String p,boolean[][] maze, int r, int c, int[][] path, int step){
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            allPathsPrint(p + "D",maze , r + 1, c, path, step + 1);
        } 
        if (c < maze[0].length - 1)  {
            allPathsPrint(p + "R",maze , r, c + 1, path, step + 1);
        }
        if (r > 0)  {
            allPathsPrint(p + "U",maze , r - 1, c, path, step + 1);
        }
        if (c > 0)  {
            allPathsPrint(p + "L",maze , r, c - 1, path, step + 1);
        }

        // this line is where the function will be over, 
        // so before the function gets removed, also 
        // remove the changes that were made by that function
        maze[r][c] = true;  // (This is backtracking)
        path[r][c] = 0;
    }
}