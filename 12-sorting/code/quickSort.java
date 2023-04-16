import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int arr[], int low, int high){
        // s and e variable uses for basically swapping
        // low and high variable uses for figuring out in which part of array we are working on

        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (arr[s] < pivot) {  
                s++;
            }

            while (arr[e] > pivot) {
                e--;
            }
            // Now we are at violation condition
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // Now is the time for recursion call
        // now my pivot is at correct index, please sort two halves now
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
