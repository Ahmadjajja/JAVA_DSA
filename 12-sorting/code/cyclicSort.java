import java.util.Arrays;

public class cyclicSort {
    public static int[] cyclic(int[] arr){
         int i = 0;
         while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
         }
        return arr;
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cyclic(arr);
        System.out.println("sorted array : " + Arrays.toString(arr));
    }
}
