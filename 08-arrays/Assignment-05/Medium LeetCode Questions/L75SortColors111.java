// Given an array nums with n objects colored red, white, or blue, sort them in-place so that
//  objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.


import java.util.Arrays;

public class L75SortColors111 {
    public static int[] sortColors(int[] nums) {
        int count = 0;
        for (int i = nums.length - 1; i >= count; i--) { // sorting 0's
            if (nums[i] == 0) {
                while (nums[i] == nums[count] && count != i) {
                    count++;
                }
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }
        }

        for (int i = nums.length - 1; i >= count; i--) { // sorting 1's
            if (nums[i] == 1) {
                while (nums[i] == nums[count] && count != i) {
                    count++;
                }
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortColors(new int[] { 2, 0, 2, 1, 1, 0 })));
    }
}


// Solved in in-place algorithm
