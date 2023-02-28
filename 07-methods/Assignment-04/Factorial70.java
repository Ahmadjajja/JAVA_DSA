// Write a program to print the factorial of a number by defining a method named 'Factorial'. 
// Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
// 4! = 1 * 2 * 3 * 4 = 24 
// 3! = 3 * 2 * 1 = 6 
// 2! = 2 * 1 = 2 
// Also, 
// 1! = 1 
// 0! = 1


import java.util.*;

public class Factorial70 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Enter any positive num: ");
            num = input.nextInt();
            if (num >= 0) {
                break;
            } else {
                System.out.println("Invalid num!");
            }
        }

        System.out.println("Factorial of "+ num +" is: " + factorial(num));
        
    }

    static int factorial(int num) {
        if (num == 0) {
            return 0;
        }
        int f = 1;
        for (int i = num; i > 0; i--) {
            f *= i;
        }
        return f;
    }
}