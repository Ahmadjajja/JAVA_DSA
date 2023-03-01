// 1480. Running Sum of 1d Array

// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.

 

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].



import java.util.Arrays;

public class L1480_Running_Sum_Of_1d_Array77 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                sum[i] = nums[i];
            } else {
                sum[i] = sum[i - 1] + nums[i]; 
            }
        }
        return sum;
    }
}
