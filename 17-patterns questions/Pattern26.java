// 26.   1 1 1 1 1 1
//       2 2 2 2 2
//       3 3 3 3
//       4 4 4
//       5 5
//       6


public class Pattern26 {
    public static void main(String[] args) {
        pattern(6);
    }

    static void pattern(int n) {
        for (int rows = 1; rows <= n; rows++) {
            // Adding spaces at start
            for (int i = 0; i < n - rows + 1; i++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
    }
}