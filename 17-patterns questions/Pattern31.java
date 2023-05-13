
// 31.      4 4 4 4 4 4 4  
//          4 3 3 3 3 3 4       
//          4 3 2 2 2 3 4   
//          4 3 2 1 2 3 4   
//          4 3 2 2 2 3 4   
//          4 3 3 3 3 3 4   
//          4 4 4 4 4 4 4  



public class Pattern31 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        int rows = n*2 - 1;
        int cols = n*2 - 1;
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                int printingElement = Math.max(Math.abs(n - col ) + 1, Math.abs(n - row) + 1);
                System.out.print(printingElement + " ");
            }
            System.out.println();
        }
    }
}