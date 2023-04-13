import java.util.Arrays;

public class insertionSort {
    public static int[] insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
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
        int[] nums = {1,2,3,5,2,3,45,34,2,1};
        insertion(nums);
        System.out.println("sorted arr: " + Arrays.toString(nums));
    }
   
}
