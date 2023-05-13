// 27.   1 2 3 4  17 18 19 20
//         5 6 7  14 15 16
//           8 9  12 13
//             10 11



public class Pattern27 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        int s = 0, e = 0;
        for (int i = 0; i < n; i++) {
            e += (n - i) * 2;
        }
        
        for (int rows = 1; rows <= n; rows++) {
            int cols = 2 * n - (rows - 1) * 2;
            // Adding spaces on left side
            for (int i = 0; i < rows - 1; i++) {
                System.out.print("  ");
            }

            // printing elements at center
            for (int col = 1; col <= cols; col++) {
                int pElement = col <= cols / 2 ? ++s: e - (cols - col);
                System.out.print(pElement + " ");
            }
            
            // Adding spaces on right side
            for (int i = 0; i < rows - 1; i++) {
                System.out.print("  ");
            }
            e -= n - (rows - 1);    // Decrementing value according to situations
            System.out.println();
        }
    }
}