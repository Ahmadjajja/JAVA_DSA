// 20.    ****
//        *  *
//        *  *
//        *  *
//        ****

public class Pattern20 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols < n; cols++) {
                if(rows == 1 || rows == n){
                    System.out.print("*");
                    continue;
                }
                if (cols == 1 || cols == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}