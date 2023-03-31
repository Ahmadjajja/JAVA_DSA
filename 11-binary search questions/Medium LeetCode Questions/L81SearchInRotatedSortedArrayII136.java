// There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

// Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

// Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

// You must decrease the overall operation steps as much as possible.

public class L81SearchInRotatedSortedArrayII136 {
    public static boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            if (nums[start] == target || nums[end] == target) {
                return true;
            }
            if (target > nums[start]) {
                while (start < end && nums[start + 1] == nums[start]) {
                    start++;
                }
                start++;
            } else if(target < nums[end]) {
                while (start < end && nums[end - 1] == nums[end]) {
                    end--;
                }
                end--;
            } else {
                break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] { 1, 0, 1, 1, 1, }, 0));
    }
}
