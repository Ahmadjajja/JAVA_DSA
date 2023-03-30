
// Alice and Bob have a different total number of candies. You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.

// Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.

// Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, and answer[1] is the number of candies in the box that Bob must exchange. If there are multiple answers, you may return any one of them. It is guaranteed that at least one answer exists.

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class L888FairCandySwap129 {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0, sumBob = 0;
        ArrayList<Integer> bSizes = new ArrayList<Integer>();
        for (int a : aliceSizes) {
            sumAlice += a;
        }
        for (int b : bobSizes) {
            sumBob += b;
            bSizes.add(b);
        }
        int diff = (sumAlice - sumBob) / 2;
        Collections.sort(bSizes);
        for (int a : aliceSizes) {
            int start = 0, end = bSizes.size() - 1;
            int target = a - diff;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (bSizes.get(mid) == target) {
                    return new int[] { a, target };
                }
                if (bSizes.get(mid) > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(fairCandySwap(new int[] { 1, 1 }, new
        // int[] { 2, 2 })));
        // System.out.println(Arrays.toString(fairCandySwap(new int[] { 1, 2 }, new int[] { 2, 3 })));
        System.out.println(Arrays.toString(fairCandySwap(new int[]{2}, new
        int[]{1,3})));
    }
}
