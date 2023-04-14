import java.util.ArrayList;
// Leetcode submission url: https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/933431234/
// Asked in Amazon, Microsoft

import java.util.Arrays;
import java.util.List;

public class allDuplicates160 {
    public static List<Integer> findDuplicates(int[] nums) {
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
         List<Integer> list = new ArrayList<>();
        // finding all missing numbers
         for (int j = 0; j < nums.length; j++) {  
            if (nums[j] != j + 1) {
                list.add(nums[j]);
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
        int[] arr = {4, 1, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(arr));
    }
}
