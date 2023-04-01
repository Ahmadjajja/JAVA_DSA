// You are given an array of intervals, where intervals[i] = [starti, endi] and each starti is unique.

// The right interval for an interval i is an interval j such that startj >= endi and startj is minimized. Note that i may equal j.

// Return an array of right interval indices for each interval i. If no right interval exists for interval i, then put -1 at index i.

import java.util.Arrays;

public class L436FindRightInterval139 {
    public static int[] findRightInterval(int[][] intervals) {
        int[] res = new int[intervals.length];
        int row = 0, col = intervals[0].length - 1;
        while (row <= (intervals.length - 1)) {
            int start = 0, end = intervals.length - 1;
            boolean check = false;
            if (intervals[start][0] >= intervals[end][0]) {
                check = true;
            }
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (intervals[mid][0] >= intervals[row][col]) {
                    if (check) {

                        if (mid < intervals.length ) {
                            while (intervals[mid + 1][0] >= intervals[row][col]) {
                                res[row] = ++mid;
                                if (mid == intervals.length ) {
                                    break;
                                }
                            }
                            res[row] = mid;
                        } else {
                            res[row] = mid;
                        }
                    } else {

                        if (mid > 0) {
                            while (intervals[mid - 1][0] >= intervals[row][col]) {
                                res[row] = --mid;
                                if (mid == 0) {
                                    break;
                                }
                            }
                            res[row] = mid;
                        } else {
                            res[row] = mid;
                        }
                    }
                    break;
                } else {
                    if (check) {
                        end = mid - 1;
                        res[row] = end;
                    } else {
                        start = mid + 1;
                        res[row] = start > (intervals.length - 1) ? -1 : start;
                    }
                }
            }
            row++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {
                // {1,2}, // valid use case

                // {3,4}, // valid use case
                // {2,3},
                // {1,2}

                // {1,4}, // valid use case
                // {2,3},
                // {3,4},

                // { 1, 2 }, // valid use case
                // { 2, 3 },
                // { 1, 1 },
                // { 3, 4 },

                { 1, 1 }, // valid use case
                { 3, 4 },
        };
        System.out.println(Arrays.toString(findRightInterval(arr)));
    }
}
