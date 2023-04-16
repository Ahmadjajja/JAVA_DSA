import java.util.Arrays;

import java.util.Arrays;

public class MergeSortInPlace {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length);
        
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {  // base condition
            return;
        }

        int mid = s + ( e - s) / 2;

        // Things to note over here is that recursion actually
        // creating new objects for every function call, Original
        // array is not been modified

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s; // this pointer points to first part array
        int j = m; // this pointer points to second part array
        int k = 0; // this pointer points to mix array

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++; 
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        // in both of these loops either one is going to true
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("mix : " + Arrays.toString(mix));
        for (int k2 = 0; k2 < mix.length; k2++) {
            arr[s+k2] = mix[k2];
        }
    }
}

//