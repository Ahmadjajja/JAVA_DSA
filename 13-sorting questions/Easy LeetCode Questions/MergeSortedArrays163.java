import java.util.*;

public class MergeSortedArrays163 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mix = new int[m + n];

        int i = 0; // this pointer points to first part array
        int j = 0; // this pointer points to second part array
        int k = 0; // this pointer points to mix array

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mix[k] = nums1[i];
                i++;
            } else {
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // in both of these loops either one is going to true
        while (i < m) {
            mix[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            mix[k] = nums2[j];
            j++;
            k++;
        }
        // updating sorted portion of array element with same unsorted potion of array
        for (int k2 = 0; k2 < mix.length; k2++) {
            nums1[k2] = mix[k2];
        }
    }

    public static void main(String[] args) {
        int[] num1 = { 1, 2, 3, 0, 0, 0 };
        int[] num2 = { 2, 5, 6 };

        merge(num1, 3, num2, 3);

        System.out.println(Arrays.toString(num1));
    }
}