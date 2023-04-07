import java.util.Arrays;

// The frequency of an element is the number of times it occurs in an array.

// You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.

// Return the maximum possible frequency of an element after performing at most k operations.

public class L1838FrequencyOfTheMostFrequentElement146 {
    public static int maxFrequency(int[] nums, int k) {

        // sliding window
        Arrays.sort(nums); // n
        int left = 0, right = 0;
        long total = 0, res = 0;
        while (right < nums.length) { // this whole portion will run in log(n)

            total += nums[right];
            while ((long) nums[right] * (right - left + 1) > (total + k)) {
                total -= nums[left];
                left += 1;
            }
            res = Math.max(res, (right - left + 1));
            right += 1;

        }
        return (int) res; // n log(n)
    }

    public static void main(String[] args) {
        int[] arr = { 100000, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999,
                99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999,
                99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999,
                99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999,
                99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999,
                99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999,
                99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999,
                99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999,
                99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999,
                99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999,
                99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999, 99999,
                99999, 99999 };
        int k = 100000;
        // int[] arr = {1,4,8,13};
        // int k = 5;
        maxFrequency(arr, k);
        System.out.println(maxFrequency(arr, k));
    }
}