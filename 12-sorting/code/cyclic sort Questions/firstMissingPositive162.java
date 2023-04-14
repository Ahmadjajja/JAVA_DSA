import java.util.ArrayList;
// Leetcode submission url: https://leetcode.com/problems/first-missing-positive/submissions/933478330/

import java.util.Arrays;
import java.util.List;

public class firstMissingPositive162 {
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        // finding all missing numbers
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        return nums.length + 1;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, -1, 1};
        System.out.println(firstMissingPositive(arr));
    }
}
