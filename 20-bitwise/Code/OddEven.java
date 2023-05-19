public class OddEven {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        // Carefully Note:
        // n first will be converted into binary to perform any action
        return (n & 1) == 1;
    }
}