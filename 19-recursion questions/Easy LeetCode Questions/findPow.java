public class findPow{
    public static void main(String[] args) {
        System.out.println(findX(32, 3, 0));
    }
    static int findX(int n, int a, int count){
        if (n == 1 || n < a) {
            return count;
        }
        return findX(n / a, a, ++count);
    }
}