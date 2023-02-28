// Define a method to find out if a number is prime or not.

// Prime numbers are positive integers (whole numbers greater than 1) that
//  have no positive integer divisors other than 1 and themselves. In other
//  words, a prime number is only divisible by 1 and itself.

// For example, the first few prime numbers are:

// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, ...

import java.util.*;
public class Prime_Or_Not68{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = input.nextInt();
        System.out.println(num + " is " + primeOrNot(num) + " Number");
    }

    static String primeOrNot(int num) {
        String primeOrNot = "";
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 ) {
                count++;
            }
        }
        if (count == 1) {
            primeOrNot = "Prime";
        } else {
            primeOrNot = "Not Prime";
        }  
        return primeOrNot;
    }
}