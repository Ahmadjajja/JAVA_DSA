// class Solution {
//     public int numSquares(int n) {
//         ArrayList<Integer> list = new ArrayList<>();
//         int ans = Integer.MAX_VALUE;
//         for(int i = 1; i <= n; i++){
//             if(perfectSquare(i)){
//                 list.add(i);
//             }
//         }

//         // Try to solve with DP Bottom up approach
//         return helper(list, n, 0);
//     }
//     private static int helper(ArrayList<Integer> list, int target, int count){
//         if(target == 0){
//             return count;
//         }
//         int ans = Integer.MAX_VALUE;
//         for(int i = 0; i < list.size(); i++){
//             if(target -list.get(i) >= 0){
//                 ans = Math.min(ans , helper(list, target - list.get(i), count + 1));
//             }
//         }
//         return ans;
//     }
//     boolean perfectSquare(int num){
//         int start = 1;
//         int end = num;
//         while(start <= end){
//             int mid = start + (end - start) / 2;
//             if(mid * mid == num){
//                 return true;
//             }
//             if(mid * mid > num){
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
//         }
//         return false;
//     }
// }


// // // Time complexity: O(N * sqrt(N))
// // // Space complexity: O(N)
// // // Bottom UP DP (Using DP Array)

class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            
            for (int j = 1; j * j <= i; j++) {
                int square = j * j;
                dp[i] = Math.min(dp[i], 1 + dp[i - square]);
            }
            System.out.print(dp[i] + " ");
        }
        
        return dp[n];
    }
}