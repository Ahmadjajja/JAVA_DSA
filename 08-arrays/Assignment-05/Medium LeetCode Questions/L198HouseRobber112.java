// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
// the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and 
// it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob
// tonight without alerting the police.

// Dynamic programming technique used here in this problem

public class L198HouseRobber112 {
    public static int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;
        // [rob1, rob2, n, n + 1, ...]
        for (int n:nums) {
            int temp = Math.max( n + rob1, rob2); 
            rob1 = rob2;   
            rob2 = temp;   
        }
        return rob2;       
    }
    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,1,1, 1,5, 7}));
    }
}
