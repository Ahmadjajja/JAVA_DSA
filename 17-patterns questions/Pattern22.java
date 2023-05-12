// 22.    1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

public class Pattern22 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int rows = 1; rows <= n; rows++) {
            int zeroOne = rows % 2;
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(zeroOne + " ");
                zeroOne = zeroOne == 0 ? 1 : 0;
            }
            System.out.println();
        }
    }
} 