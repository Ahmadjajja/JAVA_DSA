// Given two integer arrays nums1 and nums2, return an array of their intersection. 
// Each element in the result must be unique and you may return the result in any order.

import java.util.ArrayList;
import java.util.Arrays;

public class L350IntersectionOfTwoArraysII128 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listNums2 = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            listNums2.add(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < listNums2.size(); j++) {
                if (nums1[i] == listNums2.get(j)) {
                    list.add(nums1[i]);
                    listNums2.remove(j);
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
        System.out.println(Arrays.toString(intersection(new int[]{1, 2 ,1, 2}, new int[]{2,2, 2,2,1, 1,1})));
        // System.out.println(Arrays.toString(intersection(new int[]{9,4,9,8,4}, new int[]{4,9,5})));
    }
}
