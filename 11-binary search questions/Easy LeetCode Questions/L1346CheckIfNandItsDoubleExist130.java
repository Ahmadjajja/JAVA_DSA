// Given an array arr of integers, check if there exist two indices i and j such that :

// i != j
// 0 <= i, j < arr.length
// arr[i] == 2 * arr[j]

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class L1346CheckIfNandItsDoubleExist130 {
    public static boolean check(int[] arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int b : arr) {
            list.add(b);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            int start = 0, end = list.size() - 1;
            int target = 2 * list.get(i);
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (list.get(mid) == target && i != mid ) {
                    return true;
                }
                if (list.get(mid) > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(check(new int[]{-2,0,10,-19,4,6,-8}));
    }
}
