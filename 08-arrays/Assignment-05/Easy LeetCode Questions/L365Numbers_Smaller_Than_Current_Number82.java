// 1365. How Many Numbers Are Smaller Than the Current Number
// Easy
// 4.4K
// 91
// Companies
// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

// Return the answer in an array.

 

// Example 1:

// Input: nums = [8,1,2,2,3]
// Output: [4,0,1,1,3]
// Explanation: 
// For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
// For nums[1]=1 does not exist any smaller number than it.
// For nums[2]=2 there exist one smaller number than it (1). 
// For nums[3]=2 there exist one smaller number than it (1). 
// For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).


import java.util.Arrays;

public class L365Numbers_Smaller_Than_Current_Number82 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 3 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count;
        int[] countArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int index = 0; index < nums.length; index++) {
                if(nums[index] < nums[i] && index != i){
                    count++;
                }
            }
            countArr[i] = count;
        }
        return countArr;
    }
}
