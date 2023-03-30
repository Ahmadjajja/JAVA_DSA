import java.util.ArrayList;
import java.util.Collections;

// You are given an array nums of non-negative integers. nums is considered special if there
// exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.

// Notice that x does not have to be an element in nums.

// Return x if the array is special, otherwise, return -1. It can be proven that if nums is special,
// the value for x is unique.

public class L1608SpeciaArrayWithXElementsGreaterThanOrEqualX131 {
    public static int specialArray(int[] nums) {
        // time complexity O(n2)

        // for(int i = 1; i <= nums.length; i++){
        // int count = 0;
        // for(int n: nums){
        // if(n >= i){
        // count++;
        // }
        // }
        // if(count == i){
        // return i;
        // }
        // }
        // return -1;

        // time complexity O(n log(n))

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int b : nums) {
            list.add(b);
        }
        Collections.sort(list);
        int start = 0, end = list.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = 0;
            for (int l : list) {
                if (l >= mid) {
                    count++;
                }
            }
            if (count == mid) {
                return mid;
            }
            if (count > mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // System.out.println(specialArray(new int[] { 3, 5 }));
        // System.out.println(specialArray(new int[] { 0, 0 }));
        System.out.println(specialArray(new int[] { 0,4,3,0,4 }));
    }
}
