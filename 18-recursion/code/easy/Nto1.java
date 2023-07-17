public class Nto1{
    public static void main(String[] args) {
        funBoth(5);
    }
    private static void funBoth(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n); 
        funBoth(n - 1);
        System.out.println(n); 
    }
}