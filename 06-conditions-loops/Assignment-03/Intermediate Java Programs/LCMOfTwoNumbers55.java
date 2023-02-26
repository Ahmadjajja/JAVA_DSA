// LCM Of Two Numbers

// LCM stands for Least Common Multiple, which is the smallest positive
// integer that is a multiple of two or more numbers. 

// Step 1: List the multiples of each number
// Multiples of 4: 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60, ...
// Multiples of 6: 6, 12, 18, 24, 30, 36, 42, 48, 54, 60, ...

// Step 2: Identify the smallest multiple that both numbers have in common
// The smallest multiple that both numbers have in common is 12.

// Therefore, the LCM of 4 and 6 is 12.

import java.util.*;

public class LCMOfTwoNumbers55 {
    // HCF of u and v using recursive method
    static int HCF(int u, int v) {
        if (u == 0)
            return v;
        return HCF(v % u, u);
    }

    // LCM of two numbers
    static int LCM(int u, int v) {
        return (u / HCF(u, v)) * v;
    }

    // The Driver method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int num1 = input.nextInt();
        System.out.println("Enter second num: ");
        int num2 = input.nextInt();
        System.out.println("LCM of " + num1 + " and " + num2
                + " is " + LCM(num1, num2));
    }
}