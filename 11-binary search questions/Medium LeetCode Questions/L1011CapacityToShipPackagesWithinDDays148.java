// A conveyor belt has packages that must be shipped from one port to another within days days.

// The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

// Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

import java.util.Arrays;

public class L1011CapacityToShipPackagesWithinDDays148 {
    public static int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }
        while (left < right) {
            int mid = (left + right) / 2;
            int capacity = 0, requiredDays = 1;
            for (int w : weights) {
                if (capacity + w > mid) {
                    requiredDays++;
                    capacity = 0;
                }
                capacity += w;
            }
            if (requiredDays > days) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        System.out.println(shipWithinDays(new int[]{3,2,2,4,1,4}, 3));
    }
}