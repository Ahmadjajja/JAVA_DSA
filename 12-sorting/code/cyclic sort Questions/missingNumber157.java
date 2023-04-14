// leetcode submission url: https://leetcode.com/problems/missing-number/submissions/933129425/
// asked in amazon
import java.util.Arrays;

public class missingNumber157 {
    public static int missingNumber(int[] nums){
         int i = 0;
         while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
         }
         System.out.println("nums: " + Arrays.toString(nums));

         // search for first missing number
         for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
         }
        return nums.length;
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,0,3};
        System.out.println("sorted array : " + missingNumber(arr));
        System.out.println("arr : ... " + Arrays.toString(arr)); 
    }
}

