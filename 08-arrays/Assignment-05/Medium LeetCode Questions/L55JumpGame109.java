// You are given an integer array nums. You are initially positioned at the array's first index,
// and each element in the array represents your maximum jump length at that position.

// Return true if you can reach the last index, or false otherwise.



public class L55JumpGame109 {
    public static boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(i + nums[i] >= goal){
                goal = i;
            }
        }
        return goal == 0 ? true : false;
    }
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 0}));
    }
}

// Problem solved in O(n) time complexity
// We can also solve this Question using greedy approach O(n2)