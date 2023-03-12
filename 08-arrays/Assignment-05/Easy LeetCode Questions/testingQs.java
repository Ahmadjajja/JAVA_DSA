import java.util.Arrays;

public class testingQs {
    class Solution {
        public boolean findRotation(int[][] mat, int[][] target) {
            int[][] tempMatrix = new int[mat.length][];
            for(int i = mat.length - 1; i >= 0; i--){
                tempMatrix[(mat.length - 1) - i ] = mat[i];
            }
            if(tempMatrix.length != target.length || tempMatrix[0].length != target[0].length){ // corner case
                System.out.println("In above corner case");
                return false;
            }
            for(int i = 0; i < mat.length; i++){
                System.out.println("mat[i]" + Arrays.toString(mat[i]));
            }
            for(int i = 0; i < tempMatrix.length; i++){
                System.out.println("tempMatrix[i]" + Arrays.toString(tempMatrix[i]));
            }
            for(int i = 0; i < tempMatrix.length; i++){
                System.out.println("target[i]" + Arrays.toString(target[i]));
            }
            for(int i = 0; i < tempMatrix.length; i++){
                for(int j = 0; j < tempMatrix[i].length; j++ ){
                    if(tempMatrix[i][j] != target[i][j]){
                        System.out.println("i " + i + " j " + j);
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        
    }
}
