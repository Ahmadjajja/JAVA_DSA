// Given two integer arrays nums1 and nums2, return an array of their intersection. 
// Each element in the result must be unique and you may return the result in any order.

import java.util.ArrayList;
import java.util.Arrays;

public class L349IntersectionOfTwoArrays127 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean check;
        for (int i = 0; i < nums1.length; i++) {
            check = true;
            if (list.size() > 0) {
                for (int j = 0; j < list.size(); j++) {
                    if (nums1[i] == list.get(j)) {
                        check = false;
                        break;
                    }
                }
            }
            for (int j = 0; j < nums2.length; j++) {
                if (check && nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    break;
                }
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2, 2,1}, new int[]{2,2, 2, 1})));
        // System.out.println(Arrays.toString(intersection(new int[]{9,4,9,8,4}, new int[]{4,9,5})));
    }
}
