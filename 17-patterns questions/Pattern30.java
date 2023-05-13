
// 30.         1
//           2 1 2
//         3 2 1 2 3
//       4 3 2 1 2 3 4
//     5 4 3 2 1 2 3 4 5



public class Pattern30 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int rows = 1; rows <= n; rows++) {
            int numCols = (n*2 - 1) - (n - rows) * 2; 
            int right = 1;
            int left = numCols / 2 + 1;
            // Adding spaces to the right
            for (int i = 0; i < n - rows; i++) {
                System.out.print("  ");
            }
            // Adding elements at the center
            for (int cols = 1; cols <= numCols; cols++) {
                
                if (left == 1) {
                    System.out.print(right++ + " ");   
                    continue;
                }
                System.out.print(left-- + " ");
            }

            // Adding spaces to the right
            for (int i = 0; i < n - rows; i++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}