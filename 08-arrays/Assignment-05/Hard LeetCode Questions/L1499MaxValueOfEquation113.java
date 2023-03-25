import java.util.ArrayList;

// You are given an array points containing the coordinates of points on a 2D plane, sorted by the x-values,
// where points[i] = [xi, yi] such that xi < xj for all 1 <= i < j <= points.length. You are also given an integer k.

// Return the maximum value of the equation yi + yj + |xi - xj| where |xi - xj| <= k and 1 <= i < j <= points.length.

// It is guaranteed that there exists at least one pair of points that satisfy the constraint |xi - xj| <= k.


public class L1499MaxValueOfEquation113 {
    static int findMaxValueOfEquation(int[][] points, int k) {
        int max = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        System.out.println(points.length - 1);
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if ((Math.abs(points[i][0] - points[j][0]) <= k) && j <= points.length -1) {
                    list.add(points[i][1] + points[j][1] + Math.abs(points[i][0] - points[j][0]));
                    if (count == 0) {
                        max = points[i][1] + points[j][1] + Math.abs(points[i][0] - points[j][0]);
                        count++;
                    }
                    if ((points[i][1] + points[j][1] + Math.abs(points[i][0] - points[j][0])) > max) {
                        max = points[i][1] + points[j][1] + Math.abs(points[i][0] - points[j][0]);
                    }
                }
            }
        }
        System.out.println("list " + list);
        return max;
    }
    public static void main(String[] args) {
        // System.out.println(findMaxValueOfEquation(new int[][]{{0,-100000000}, {1,-100000000}}, 1));
        // System.out.println(findMaxValueOfEquation(new int[][]{{1,3}, {2,0}, {5,10}, {6,-10}}, 1));
        System.out.println(findMaxValueOfEquation(new int[][]{{-19,-12},{-13,-18},{-12,18},{-11,-8},{-8,2},{-7,12},{-5,16},{-3,9},{1,-7},{5,-4},{6,-20},{10,4},{16,4},{19,-9},{20,19}}, 6));
    }
}





// This solution is solved using array data structure and is not valid for large inputs Because time limit exceed issue happens