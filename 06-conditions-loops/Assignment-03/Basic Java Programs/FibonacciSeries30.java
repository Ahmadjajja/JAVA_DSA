// Fibonacci Series

// The Fibonacci series is a sequence of numbers in which each number is the sum of the two preceding ones, starting from 0 and 1. In mathematical terms, the Fibonacci series is defined by the following recurrence relation:

// F(n) = F(n-1) + F(n-2)

// where F(n) represents the nth number in the sequence, and F(0) = 0, F(1) = 1.

// The first few numbers in the Fibonacci series are:

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, ...

import java.util.*;

public class FibonacciSeries30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the Fibonacci Series: ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + ", " + b + ", ");
        for (int i = 2; i < n; i++) {
            int temp = a ;
            a = b;
            b = temp + b;
            if (i == n) {
                System.out.println(b);
            } else {
                System.out.print(b + ", ");  
            }
        }
    }
}