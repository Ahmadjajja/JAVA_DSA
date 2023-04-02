import java.util.Arrays;

// You are given two positive integer arrays nums1 and nums2, both of length n.

// The absolute sum difference of arrays nums1 and nums2 is defined as the sum of |nums1[i] - nums2[i]| for each 0 <= i < n (0-indexed).

// You can replace at most one element of nums1 with any other element in nums1 to minimize the absolute sum difference.

// Return the minimum absolute sum difference after replacing at most one element in the array nums1. 
// Since the answer may be large, return it modulo 10^9 + 7.

// |x| is defined as:

// x if x >= 0, or
// -x if x < 0.

// Solution 

// -> steps
// -> sort nums1 array to find last most element ( Greater element)
// -> declare two variable maxReduction (for storing reduction for calculating minimum absolute difference)
//    and sum (for storing sum of Both arrays elements absolute difference )
// -> iterate over both arrays to find absolute difference  and adding to sum variable
// -> finding maxReduction for each ith element through binary search and storing maxReduction in maxReduction variable
// -> subtracting max from maxReduction and return this ans .



public class L1818MinimumAbsoluteSumDifference144 {
    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] sortedNums1 = nums1.clone();
        Arrays.sort(sortedNums1);
        int maxReduction = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            // sum = (int) ((sum + diff) % (1e9 + 7));    // one way
            sum =  ((sum + diff) % 1000000007);       // second way
            int j = binarySearch(sortedNums1, nums2[i]);  // 10, 
            if (j < n) {
                maxReduction = Math.max(maxReduction, diff - Math.abs(sortedNums1[j] - nums2[i]));
            }
            if (j > 0) {
                maxReduction = Math.max(maxReduction, diff - Math.abs(sortedNums1[j - 1] - nums2[i]));
            }
        }
        // return (int) ((sum - maxReduction + (1e9 + 7)) % (1e9 + 7));    // one way
        return (sum - maxReduction + 1000000007) % 1000000007;             // second way
    }
    
    private static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        System.out.println(minAbsoluteSumDiff(new int[]{1,10,4,4,2,7}, new int[]{9,3,5,1,7,4}));
    }
}
