import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        // triangle(4, 0);
        // triangle2(4, 0);
        int[] arr = {4, 3, 2, 8, 10};
        // bubble(arr, arr.length - 1, 0);
        selection(arr, arr.length - 1, 0, Integer.MIN_VALUE, -1);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
// * * * *  (This concept is like: Bubble Sort & Selection Sort)
// * * * 
// * *
// *
    static void triangle(int r, int c){
         if (r == 0) {
            return;
         }
         if (c < r) {
             System.out.print("*");
             triangle(r, c + 1);
         } else {
             System.out.println();
             triangle(r - 1, 0);
         }
    }
    static void triangle2(int r, int c){
         if (r == 0) {
            return;
         }
         if (c < r) {
             triangle2(r, c + 1);
             System.out.print("*");
         } else {
             triangle2(r - 1, 0);
             System.out.println();
         }
    }
    static void bubble(int[] arr, int r, int c){
         if (r == 0) {
            return;
         }
         if (c < r) {
            if (arr[c] < arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
             bubble(arr, r, c + 1);
         } else {
             bubble(arr, r - 1, 0);
         }
    }
    static void selection(int[] arr, int r, int c, int max, int maxIndex){
         if (r == 0) {
            return;
         }
         if (c < r) {
             max = Math.max(max, arr[c]);
             if (max == arr[c]) {
                maxIndex = c;
             }
             selection(arr, r, c + 1, max, maxIndex);
         } else {
            if (arr[maxIndex] > arr[r]) { 
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[r];
                arr[r] = temp;
            }
             selection(arr, r - 1, 0, Integer.MIN_VALUE, -1);
         }
    }
}
