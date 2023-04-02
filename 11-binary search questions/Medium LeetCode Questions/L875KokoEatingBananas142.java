import java.util.Arrays;
import java.util.Collections;

// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

// Return the minimum integer k such that she can eat all the bananas within h hours.

public class L875KokoEatingBananas142 {
    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1, end = 0;
        for (int i : piles) {
            if (end < i) {
                end = i;
            }
        }
        int res = end;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long hours = 0;

            for (int i : piles) {
                hours += (long) Math.ceil(i / (double) mid);
            }
            if(hours <= h){
                System.out.println("hours " + hours);
                System.out.println("hours " + h);
                res = Math.min(res, mid);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{805306368,805306368,805306368}, 1000000000));
    }
}
