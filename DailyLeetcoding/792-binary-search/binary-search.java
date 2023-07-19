class Solution {
    public int search(int[] nums, int target) {
        // int start = 0, end = nums.length - 1;
        // while(start <= end){
        //     int mid = start + (end - start) / 2;
        //     if(nums[mid] == target){
        //         return mid;
        //     }
        //     if(nums[mid] > target){
        //         end = mid - 1;
        //     } else {
        //         start = mid + 1;
        //     }
        // }
        // return -1;
        return binSearchRec(nums, target, 0, nums.length - 1);
    }
    static int binSearchRec(int[] nums, int target, int start, int end){
        // base case
        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] > target){
            return binSearchRec(nums, target, start, mid - 1);
        }
        return binSearchRec(nums, target, mid + 1, end);       
    }
}