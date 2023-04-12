import java.util.Arrays;

public class selectionSort {
    public static int[] selection(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }

        return arr;
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    private static int getMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int j = start; j <= end; j++) {
            if (arr[maxIndex] < arr[j]) {
                maxIndex = j;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        int[] arr = {1,2 ,4 ,5 ,2 ,3 ,4 ,0 ,-4 , 3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
