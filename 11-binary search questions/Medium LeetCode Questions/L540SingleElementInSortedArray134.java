// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

// Return the single element that appears only once.

// Your solution must run in O(log n) time and O(1) space.

public class L540SingleElementInSortedArray134 {
    public static int singleNonDuplicate(int[] nums) {
        if(nums.length == 1 || nums.length == 2){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }
        int start = 0, end = nums.length;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }
            if(mid % 2 == 0 && nums[mid] == nums[mid + 1] || mid % 2 == 1 && nums[mid] == nums[mid - 1]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        // System.out.println(singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
        System.out.println(singleNonDuplicate(new int[]{1,2,2}));
    }
}
