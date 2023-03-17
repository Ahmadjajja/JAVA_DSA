// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.



import java.util.Arrays;

public class L34FindFirstAndLastPositionOfElementInSortedArray108 {
    public static int[] searchRange(int[] nums, int target) {
        class InnerFunction {
            public int binSearch(int[] nums, int target, boolean leftBias) {
                int l = 0, r = nums.length - 1, i = -1;
                while (l <= r) {
                    int m = (l + r) / 2;
                    if (target < nums[m]) {
                        r = m - 1;
                    } else if (target > nums[m]) {
                        l = m + 1;
                    } else {
                        i = m;
                        if (leftBias) {
                            r = m - 1;
                        } else {
                            l = m + 1;
                        }
                    }
                }
                return i;
            }
        }
        InnerFunction inner = new InnerFunction();
        return new int[] { inner.binSearch(nums, target, true), inner.binSearch(nums, target, false) };
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 8)));
    }
}


// Most efficient solution of this problem
