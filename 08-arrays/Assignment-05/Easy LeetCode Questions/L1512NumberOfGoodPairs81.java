// 1512. Number of Good Pairs

// Given an array of integers nums, return the number of good pairs.

// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

public class L1512NumberOfGoodPairs81 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 3 };
        System.out.println(numIdenticalPairs(arr));
    }

    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int index = i; index < nums.length; index++) {
                if (nums[i] == nums[index] && i != index) {
                    count++;
                }
            }
        }
        return count;
    }
}
