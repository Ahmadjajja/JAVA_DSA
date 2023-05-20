package com.kunal.bitwise;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 9;  // number may be in any number system
        int b = 2;  // may be any base

        int ans = (int)(Math.log(n) / Math.log(b)) + 1;

        System.out.println(ans);
        System.out.println((23 << 1));
        System.out.println((1 << 3));

    }
}
