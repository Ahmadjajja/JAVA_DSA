// 33.    a
//        B c
//        D e F
//        g H i J
//        k L m N o



public class Pattern33 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print((char)(96 + count++) + " ");
            }
            System.out.println();
        }
    }
}