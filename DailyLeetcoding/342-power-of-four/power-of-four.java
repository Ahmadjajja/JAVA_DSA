class Solution {
    public boolean isPowerOfFour(int x) {
        // Binary form of 4 power is as follows
        // 4 power 0 -> 1
        // 4 power 1 -> 100
        // 4 power 2 -> 10000     
        if (x<1) return false;
        if (x==1) return true;

        int chkbit = 3;

        // Check if the number has only one set bit
        if ((x & (x - 1)) != 0)
            return false;

        // Left-shift the number by 2 bits and check
        // if last two bits are zeros.
        while ((chkbit & x) == 0)
            x >>= 2;
            
        // Return true iff the last bit is set.
        return ((x & chkbit) == 1);          
    }
}