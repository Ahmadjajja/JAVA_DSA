import java.util.Arrays;

public class bubbleSort {
    public static int[] bubble(int[] arr){
        Boolean swapped;
        // run the steps n - 1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous items
                if (arr[j] < arr[j -1]) {
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program.
            if (!swapped) {   // !false = true
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        bubble(arr);
        System.out.println("arr : " + Arrays.toString(arr));  // reference by value concepts is used here
    }
}