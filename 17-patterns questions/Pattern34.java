// 34.    E D C B A
//        D C B A
//        C B A
//        B A
//        A



public class Pattern34 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j > 0; j--) {
                System.out.print((char)(64 + j) + " ");
            }
            System.out.println();
        }
    }
}