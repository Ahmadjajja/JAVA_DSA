package com.kunal.bitwise;

public class PowOfTwo {
    public static void main(String[] args) {
        int n = 31; // note: fix for n = 0
        boolean ans = n == 0 ? false : (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
