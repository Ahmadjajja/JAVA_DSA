import java.util.ArrayList;
// Leetcode submission url: https://leetcode.com/problems/set-mismatch/submissions/933440713/

import java.util.Arrays;
import java.util.List;

public class setMismatch161 {
    public static int[] findErrorNums(int[] nums) {
         int i = 0;
         while (i < nums.length) {
            int correct = nums[i] -1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
         }
         System.out.println("arr :" + Arrays.toString(nums));
         int[] list = new int[2];
        // finding all missing numbers
         for (int j = 0; j < nums.length; j++) {  
            if (nums[j] != j + 1) {
                list[0] = nums[j];
                list[1] = j + 1;
            }
         }
        return list;
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
}
