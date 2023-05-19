public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println("ans : " + ans(arr));
    }
    static int ans(int[] arr){
        int unique = 0;
        for (int x : arr) {
            System.out.print(unique + " ^  " + x + " : ");
            unique ^= x;
            System.out.println(unique);
        }

        return unique;
    }
}
