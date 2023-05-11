// 5.  *
//     **
//     ***
//     ****
//     *****
//     ****
//     ***
//     **
//     *

public class Pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int rows = 1; rows < n * 2; rows++) {
            int noOfColumns = rows <= n ? rows: (n * 2) - rows;
            for (int cols = 1; cols <= noOfColumns; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}