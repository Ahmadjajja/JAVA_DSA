import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 36;
        factors2(n);
    }
    // time complexity : O(n)
    // space complexity : O(1)
    static void factors(int n){
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            } 
        }
    }

    // time complexity : O(sqrt(n))
    // space complexity : O(sqrt(n))
    static void factors2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) { 
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            } 
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}