// Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:

// [4,5,6,7,0,1,4] if it was rotated 4 times.
// [0,1,4,4,5,6,7] if it was rotated 7 times.
// Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

// Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.

// You must decrease the overall operation steps as much as possible.

public class L154FindMinimumInRotatedSortedArrayII151 {
    public static int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(start == end){
                return nums[start];
            }
            if(nums[mid] > nums[end]){
                start = mid + 1;
            } else if(nums[mid] < nums[end]){
                end = mid;
            } else {
                end--;
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[] { 2, 2, 2,2,2,1,2 }));
    }
}
