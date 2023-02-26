// Perfect Number In Java

// A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. In other words, the sum of all its divisors (except itself) is equal to the number itself. For example, 6 is a perfect number because its proper divisors are 1, 2, and 3, and 1 + 2 + 3 = 6.

// The first few perfect numbers are 6, 28, 496, 8128, and 33,550,336. The discovery and study of perfect numbers dates back to ancient Greek mathematics.

import java.util.*;

public class PerfectNumber57 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = input.nextInt();
        int divisorsSum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                divisorsSum += i;
            }
        }

        if (number == divisorsSum) {
            System.out.println(number + " is Perfect Number");
        } else {
            System.out.println(number + " is not Perfect Number");
        }


    }
    
}