// Given a number of pages in N different books and M students. 
// The books are arranged in ascending order of the number of pages.
// Every student is assigned to read some consecutive books. 
// The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.


// Input : pages[] = {12, 34, 67, 90} , m = 2
// Output : 113
// Explanation: There are 2 number of students. Books can be distributed in following fashion : 
// 1) [12] and [34, 67, 90]
// Max number of pages is allocated to student ‘2’ with 34 + 67 + 90 = 191 pages
// 2) [12, 34] and [67, 90] Max number of pages is allocated to student ‘2’ with 67 + 90 = 157 pages 
// 3) [12, 34, 67] and [90] Max number of pages is allocated to student ‘1’ with 12 + 34 + 67 = 113 pages

// Of the 3 cases, Option 3 has the minimum pages = 113.

import java.util.Arrays;

// Java program for optimal allocation of pages

public class BookAllocation153 {
    static int findPages(int[] arr, int length, int m) {
        if (length < m) {
            return -1;
        }
        int sum = Arrays.stream(arr).sum();
        int max = Arrays.stream(arr).max().getAsInt();
        int start = max, end = sum;
        int result = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(arr, length, m, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }


    static boolean isPossible(int[] arr, int length, int m, int mid) {
        int requiredStudents = 1;
        int curr_sum = 0;
        for (int i : arr) {
            curr_sum += i;
            if (curr_sum > mid) {
                requiredStudents++;
                curr_sum = i;
            }
        }
        return requiredStudents <= m;
    }


    // Driver Method
    public static void main(String[] args) {

        int arr[] = { 12, 34, 67, 90 }; // Number of pages in books

        int m = 2; // No. of students

        System.out.println("Minimum number of pages = " + findPages(arr, arr.length, m));
    }

}
