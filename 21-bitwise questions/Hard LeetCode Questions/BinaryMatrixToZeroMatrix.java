public class BinaryMatrixToZeroMatrix{
        public static int minFlips(int[][] mat) {
        if (zeroChecking(mat)) {
            return 0;
        }

        int minSteps = Integer.MAX_VALUE;
        int rows = mat.length;
        int cols = mat[0].length;
        int length = (int) Math.pow(2, rows * cols);
        int totalElements = rows * cols;

        for (int i = 0; i < length; i++) {
            int n = i;
            int counter = -1;

            // Deep copy of mat
            int[][] newArray = new int[mat.length][];
            for (int j = 0; j < mat.length; j++) {
                newArray[j] = mat[j].clone();
            }

            for (int j = totalElements - 1; n != 0; j--) {
                if ((n & 1) == 1) {
                    int r = j / cols;
                    int c = j % cols;
                    flip(newArray, r, c);
                    counter++;
                }
                n >>= 1;
            }

            if (zeroChecking(newArray)) {
                minSteps = Math.min(minSteps, counter + 1);
            }
        }

        return minSteps == Integer.MAX_VALUE ? -1 : minSteps;
    }
    // Check if all elements in the matrix are zero
    static boolean zeroChecking(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1)
                    return false;
            }
        }
        return true;
    }
    // Flip the cell and its adjacent cells
    static void flip(int[][] matrix, int r, int c){
        matrix[r][c] = matrix[r][c] == 1 ? 0: 1;
        if(c < matrix[0].length - 1){
            matrix[r][c + 1] = matrix[r][c + 1] == 1 ? 0: 1;
        }
        if(c > 0){
            matrix[r][c - 1] = matrix[r][c - 1] == 1 ? 0: 1;
        }
        if(r < matrix.length - 1){
            matrix[r + 1][c] = matrix[r + 1][c] == 1 ? 0: 1;
        }
        if(r > 0){
            matrix[r - 1][c] = matrix[r - 1][c] == 1 ? 0: 1;
        }
    }
    public static void main(String[] args) {
        int[][] mat = {{1,0,0},{1,0,0}};
        System.out.println(minFlips(mat));
    }
}