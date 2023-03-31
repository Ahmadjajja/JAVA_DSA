// Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

// [4,5,6,7,0,1,2] if it was rotated 4 times.
// [0,1,2,4,5,6,7] if it was rotated 7 times.
// Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

// Given the sorted rotated array nums of unique elements, return the minimum element of this array.

// You must write an algorithm that runs in O(log n) time. 

public class L153FindMinimumInRotatedSortedArray137 {
    public static int findMin(int[] nums) {
        int res = nums[0];
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            if(nums[start] < nums[end]){
                res = res < nums[start] ? res : nums[start];
                break;
            }
            int mid = start + (end - start) / 2;
            res = res < nums[mid] ? res : nums[mid];
            // Left portion
            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else { // Right portion
                end = mid - 1;
            }
        }
        return res;       
    }
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{4,5,6,7,1,2,3}));
    }
}
