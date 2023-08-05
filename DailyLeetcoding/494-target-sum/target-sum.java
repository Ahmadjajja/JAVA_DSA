// class Solution {
//     public int findTargetSumWays(int[] nums, int target) {
//         if (nums.length == 1) {
//             if (nums[0] == target || -nums[0] == target) {
//                 return 1;
//             } else {
//                 return 0;
//             }
//         }
//         return findExps(nums, target, 0, 0);
//     }
    
//     private static int findExps(int[] nums, int target, int index, int sum) {
//         // base condition
//         if (index == nums.length) {
//             if (sum == target) {
//                 return 1;
//             }
//             return 0;
//         }
        
//         int count = 0;
//         // function call for + operator
//         count += findExps(nums, target, index + 1, sum + nums[index]);
        
//         // function call for - operator
//         count += findExps(nums, target, index + 1, sum - nums[index]);
        
//         return count;
//     }
// }


class Solution {
public int findTargetSumWays(int[] nums, int target) {

    int ans=allsets(nums, 0 , 0, target, 0);
    return ans;
}

public static int allsets(int[] nums,int idx, int sum, int target, int count){
    
    if(idx==nums.length){
        if(sum==target){
            count++;
        }
        return count;
    }
    
    int ansp=allsets(nums ,idx +1 , sum + nums[idx] ,target,count);
    
    int ansm=allsets(nums ,idx +1 , sum - nums[idx] ,target,count);

    return ansp +ansm;
}
}