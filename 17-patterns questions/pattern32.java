// 32.    E
//        D E
//        C D E
//        B C D E
//        A B C D E



public class pattern32 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print((char)(64 + n - j) + " ");
            }
            System.out.println();
        }
    }
}