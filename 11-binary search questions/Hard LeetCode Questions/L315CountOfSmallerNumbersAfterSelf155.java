import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Given an integer array nums, return an integer array counts where counts[i] is the number of smaller elements to the right of nums[i].

// Input: nums = [5,2,6,1]
// Output: [2,1,1,0]
// Explanation:
// To the right of 5 there are 2 smaller elements (2 and 1).
// To the right of 2 there is only 1 smaller element (1).
// To the right of 6 there is 1 smaller element (1).
// To the right of 1 there is 0 smaller element.

public class L315CountOfSmallerNumbersAfterSelf155 {
    public static List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        Integer[] counts = new Integer[n];
        List<Integer> sorted = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            int index = findIndex(sorted, nums[i]);
            counts[i] = index;
            sorted.add(index, nums[i]);
            System.out.println("sorted " + sorted);
            System.out.println("counts " + Arrays.toString(counts));
        }
        return Arrays.asList(counts);
    }
    
    private static int findIndex(List<Integer> list, int target) {
        int left = 0, right = list.size();
        while (left < right) {
            int mid = (left + right) / 2;
            if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        System.out.println(countSmaller(new int[]{5,2,6,1}));
    }
}
