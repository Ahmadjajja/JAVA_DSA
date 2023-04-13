// leetcode submission url: https://leetcode.com/problems/find-the-duplicate-number/submissions/933262838/
// asked in amazon
import java.util.Arrays;

public class findDuplicate159 {
    public static int findDuplicate(int[] nums) {
         int i = 0;
         while (i < nums.length ) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if ( nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
         }
         System.out.println("nums: " + Arrays.toString(nums));
        return -1;
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5}; 
        // int[] arr = {3,1,3,4,2};
        System.out.println("Duplicate element : " + findDuplicate(arr));
    }
}

