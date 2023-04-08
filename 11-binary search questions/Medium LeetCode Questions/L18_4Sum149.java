import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Given an array nums of n integers, return an array of all the
//  unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.

// In general, the term "quadruplets" in coding refers to a specific group of four items that are treated
//  as a unit in a given algorithm or data structure.

public class L18_4Sum149 {

    // The commented out line `// public static List<List<Integer>> fourSum(int[] nums, int target) {`
    // is a method signature for a function that takes in an integer array `nums` and an integer
    // `target`, and returns a list of lists of integers. The purpose of this function is to find all
    // unique quadruplets in the array `nums` that add up to the `target` value.
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            // skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n - 2; j++) {
                // skip duplicates
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    long sum =  ((long)nums[i] + (long)nums[j] + (long)nums[left] + (long)nums[right]);
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        // skip duplicates
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // System.out.println(fourSum(new int[] { 1,0, -1, 0, -2, 2 }, 0));
        System.out.println(fourSum(new int[] { 1000000000,1000000000,1000000000,1000000000 }, -294967296));
    }
}

