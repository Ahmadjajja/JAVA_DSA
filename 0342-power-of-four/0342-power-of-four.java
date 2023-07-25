// class Solution {
//     public boolean isPowerOfFour(int x) {
//         // Binary form of 4 power is as follows
//         // 4 power 0 -> 1
//         // 4 power 1 -> 100
//         // 4 power 2 -> 10000     
//         if (x<1) return false;
//         if (x==1) return true;

//         int chkbit = 3;

//         // Check if the number has only one set bit
//         if ((x & (x - 1)) != 0)
//             return false;

//         // Left-shift the number by 2 bits and check
//         // if last two bits are zeros.
//         while ((chkbit & x) == 0)
//             x >>= 2;
            
//         // Return true iff the last bit is set.
//         return ((x & chkbit) == 1);          
//     }
// }
class Solution {
    public boolean isPowerOfFour(int x) {
        return helper(x, 0);
    }
    private static boolean helper(int n, int pow){
        if(n <= 0){
            return false;
        }
        // Base condition
        if(Math.pow(4, pow) >= n){
            if(Math.pow(4, pow) == n){
                return true;
            } else {
                return false;
            }
        }
        
        return helper(n, ++pow);
    }
}