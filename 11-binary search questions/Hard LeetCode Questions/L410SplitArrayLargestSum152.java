import java.util.Arrays;

// Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

// Return the minimized largest sum of the split.

// A subarray is a contiguous part of the array.

public class L410SplitArrayLargestSum152 {

    // Poor Approach

    // public static int splitArray(int[] nums, int k) {
    //     int n = nums.length;
    //     int actualSum = Integer.MAX_VALUE;
    //     for (int i = 0; i < n - 2; i++) {
    //         for (int j = i + 1; j < n - 1; j++) {
    //             int start = j + 1;
    //             int end = n - 1;
    //                 int tempSum = 0;
    //                 tempSum = Math.max(Sum(0, i, nums), tempSum);
    //                 tempSum = Math.max(Sum(i + 1, start - 1, nums), tempSum);
    //                 tempSum = Math.max(Sum(start, end, nums), tempSum);
    //                 actualSum = Math.min(tempSum, actualSum);
    //         }
    //     }

    //     return actualSum;
    // }
    // private static int Sum(int start, int end, int[] nums) {
    //     int sum = 0;
    //     for (int i = start; i <= end; i++) {
    //         sum += nums[i];
    //     }
    //     return sum;
    // }

    // efficient approach

    static int splitArray(int[] nums, int k) {
        if (nums.length < k) {
            return -1;
        }
        int sum = Arrays.stream(nums).sum();
        int max = Arrays.stream(nums).max().getAsInt();
        int start = max, end = sum;
        int result = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(nums, k, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }


    static boolean isPossible(int[] arr, int k, int mid) {
        int requiredStudents = 1;
        int curr_sum = 0;
        for (int i : arr) {
            curr_sum += i;
            if (curr_sum > mid) {
                requiredStudents++;
                curr_sum = i;
            }
        }
        return requiredStudents <= k;
    }
    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{7,2,5,10,8}, 3));
    }


}
