
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
