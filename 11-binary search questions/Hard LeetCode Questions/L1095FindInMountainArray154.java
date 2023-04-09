// (This problem is an interactive problem.)

// You may recall that an array arr is a mountain array if and only if:

// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
// Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. 
// If such an index does not exist, return -1.

// You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

// MountainArray.get(k) returns the element of the array at index k (0-indexed).
// MountainArray.length() returns the length of the array.
// Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that
//  attempt to circumvent the judge will result in disqualification.

// 1- find peak
// 2- perform simple binary search on left side
// 2- perform simple binary search on right side

public class L1095FindInMountainArray154 {
    public static int findInMountainArray(int target, int[] mountainArr) {

        int peakIndex = findPeak(mountainArr);
        int targetRightIndex = binSearch(target, mountainArr, peakIndex, true);
        if (targetRightIndex != -1) {
            return targetRightIndex;
        } else {
            int targetLeftIndex = binSearch(target, mountainArr, peakIndex, false);
            return targetLeftIndex;
        }
    }

    private static int binSearch(int target, int[] mountainArr, int e, boolean leftBiased) {
        int start, end;
        if (leftBiased) {
            start = 0; end = e;
        } else {
            start = e; end = mountainArr.length - 1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] == target) {
                return mid;
            }
            if (mountainArr[mid] > target) {
                if (leftBiased) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (leftBiased) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    private static int findPeak(int[] mountainArr) {
        int start = 0, end = mountainArr.length -1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] > mountainArr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        System.out.println(findInMountainArray(0, new int[]{3,5,3,2,0}));
    }
}
