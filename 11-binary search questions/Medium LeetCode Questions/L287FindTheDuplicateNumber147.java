import java.util.*;

public class L287FindTheDuplicateNumber147 {
    public static int findDuplicate(int[] nums) {

        // -> Time Complexity: n log(n)
        // Approach 1

        // Arrays.sort(nums);
        // int start = 0, end = nums.length - 1;
        // while (start <= end) {
        //     int mid = start + (end - start) / 2;
        //     if (nums[mid] <= mid) {
        //         if (nums[mid] == nums[mid - 1]) {
        //             return nums[mid];
        //         }
        //         end = mid - 1;
        //     } else {
        //         start = mid + 1;
        //     }
        // }
        // return -1;

        // -> Time Complexity: n log(n)
        // Approach 2
        int start = 1, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int count = 0;
            for (int i : nums) {
                if (i <= mid) {
                    count++;
                }
            }
            
            if (count <= mid) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{3,1,3,4,2}));
    }
}
