import java.util.Arrays;

// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

// Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

// The tests are generated such that there is exactly one solution. You may not use the same element twice.

// Your solution must use only constant extra space.

public class L167TwoSum_II_InputArrayIsSorted119 {
    public static int[] twoSum(int[] numbers, int target) {
        int s = 0, e = numbers.length - 1;
        while (s <= e) {
            if ((numbers[s] + numbers[e]) > target) {
                e--;
            } else if ((numbers[s] + numbers[e]) < target) {
                s++;
            } else {
                return new int[]{s+1, e+1};
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{-1,0}, -1)));
    }
}
