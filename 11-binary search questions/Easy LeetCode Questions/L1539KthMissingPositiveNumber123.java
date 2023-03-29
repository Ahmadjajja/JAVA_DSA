// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

// Return the kth positive integer that is missing from this array.

public class L1539KthMissingPositiveNumber123 {
    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int missing = compute(arr[n - 1], n);
        while(start <= end){
            int mid = start + (end - start) / 2;
            missing = compute(arr[mid], mid + 1);

            if(missing >= k){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if(end == -1) return k;
        return arr[end] + k - compute(arr[end], end + 1);
    }
    
    static int compute(int actual, int expected){
        return actual - expected;
    }

    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{2,3,4,7,11}, 5));
    }
}
