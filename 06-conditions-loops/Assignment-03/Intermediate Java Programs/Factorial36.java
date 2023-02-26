// Factorial Program In Java

// Factorial is a mathematical function denoted by the symbol "!". It is used to calculate the product of all positive integers from 1 up to a given number n. The factorial of a number n is represented as n!, and is calculated as:

// n! = 1 x 2 x 3 x ... x n

// For example, the factorial of 4 is:

// 4! = 1 x 2 x 3 x 4 = 24

import java.util.*;

public class Factorial36{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number less than 20: ");
        int number = input.nextInt();
        if (number < 20) {
            long f = 1L;
            for (int i = 1; i <= number; i++) {
                f *= i;
            }
            System.out.println("factorial of " + number + " is " + f);
        } else {
            System.out.println("Incorrect input !");
        }

    }
}