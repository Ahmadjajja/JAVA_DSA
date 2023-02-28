// Write a function that returns all prime numbers between two given numbers.


// Prime numbers are positive integers (whole numbers greater than 1) that
//  have no positive integer divisors other than 1 and themselves. In other
//  words, a prime number is only divisible by 1 and itself.

// For example, the first few prime numbers are:

// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, ...

import java.util.*;
public class All_Prime_Numbers_Between_Two_Numbers73{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = input.nextInt();
        System.out.println("Enter num2: ");
        int num2 = input.nextInt();
        System.out.println("Prime numbers between "+ num1 +" and "+ num2 +" are: "+ primeNumberCounter(num1, num2) +".");
    }

    static int primeNumberCounter(int num1, int num2) {
        int primeNumberCount = 0;
        for (int i = (num1 < num2 ? num1: num2); i <= (num1 > num2 ? num1: num2); i++) {
            int count = 0;
            for (int index = 2; index <= i; index++) {
                if (i % index == 0 ) {
                    count++;
                }
            }
            if (count == 1) {
                primeNumberCount++;
            }
        }

        return primeNumberCount;
    }
}