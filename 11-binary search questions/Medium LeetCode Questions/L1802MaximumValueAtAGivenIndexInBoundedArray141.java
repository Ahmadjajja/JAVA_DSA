// You are given three positive integers: n, index, and maxSum. You want to construct an array nums (0-indexed) that satisfies the following conditions:

// nums.length == n
// nums[i] is a positive integer where 0 <= i < n.
// abs(nums[i] - nums[i+1]) <= 1 where 0 <= i < n-1.
// The sum of all the elements of nums does not exceed maxSum.
// nums[index] is maximized.
// Return nums[index] of the constructed array.

// Note that abs(x) equals x if x >= 0, and -x otherwise.


public class L1802MaximumValueAtAGivenIndexInBoundedArray141 {
    public static int maxValue(int n, int index, int maxSum) {
        long rightSpace = n - index - 1;  // uses for right spaces
        long leftSpace = index;          // uses for left spaces

        long end = maxSum;
        long start = 1;

        long res = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sum = mid;
            long leftSum = 0;
            long rightSum = 0;

            long m = mid - 1; // confusion

            if (rightSpace <= m) {
                rightSum = m*(m + 1)/2 - (m - rightSpace)*(m - rightSpace + 1) / 2;
            } else {
                rightSum = m*(m + 1)/2 + 1 * (rightSpace - m);
            }

            if (leftSpace <= m) {
                leftSum = m*(m + 1)/2 - (m - leftSpace)*(m - leftSpace + 1) / 2;
            } else {
                leftSum = m*(m + 1)/2 + 1 * (leftSpace - m);
            }

             sum += leftSum + rightSum;

             if (sum <= maxSum) {
                res = mid;
                start = mid + 1;
             } else {
                end = mid - 1;
             }
        }
        return (int) res;
    }
    public static void main(String[] args) {
        System.out.println(maxValue(6, 1, 10));
    }
}
