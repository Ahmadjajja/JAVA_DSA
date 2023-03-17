// Given an integer array nums, return an array answer such that answer[i] is equal to the product 
// of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

import java.util.Arrays;

public class L238ProductOfArrayExceptSelf107 {
        public static int[] productExceptSelf(int[] nums) {
            int[] res = new int[nums.length];
            int postfix = 1, prefix = 1;
            for(int i = 0; i < nums.length; i++){
                res[i] = prefix;
                prefix *= nums[i];
            }
    
            for(int i = nums.length -1; i >= 0; i--){
                res[i] *= postfix;
                postfix *= nums[i];
            }
    
            return res;
        }
        public static void main(String[] args) {
            System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));
        }
}

// problem solved in O(n) time complexity and O(1) space complexity
