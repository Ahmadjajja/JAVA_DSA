import java.util.ArrayList;
import java.util.Collections;

// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

public class L18_4Sum149 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int length = nums1.length > nums2.length ? nums1.length : nums2.length;
        for (int index = 0; index < length; index++) {
            if (index < nums1.length) {
                list.add(nums1[index]);
            }
            if (index < nums2.length) {
                list.add(nums2[index]);
            }
        }
        if (list.size() == 0) {
            return 0;
        }

        Collections.sort(list);
        System.out.println(list);

        int start = 0, end = list.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (list.size() % 2 == 0) {
                return ((double) list.get(mid) + (double) list.get(mid + 1)) / 2;
            } else {
                return (double) list.get(mid);
            }
        }
        return 2.3;
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[] { 1 }, new int[] { 2 }));
    }
}