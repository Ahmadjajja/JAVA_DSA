public class Steps {
    public static void main(String[] args) {
        System.out.println(helper(14, 0));
    }
    static int helper(int n, int steps){
        if(n == 0){
            return steps;
        }

        int rem = n % 10;
        if(rem == 0){
            return helper(n / 2, steps + 1);
        } 
        return helper(n - 1, steps + 1);
    }
}
