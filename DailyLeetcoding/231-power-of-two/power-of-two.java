// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if(n < 1){
//             return false;
//         }
//         return (n & (n - 1)) == 0;
//     }
// }

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0) return false;
        else if(n == 1 || (n % 2 == 0) && isPowerOfTwo(n / 2)) return true;
        else return false;
    }
}
