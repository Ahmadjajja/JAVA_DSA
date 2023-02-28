// Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

// A Pythagorean triplet is a set of three positive integers that satisfy the Pythagorean theorem, which states that in a right triangle, the square of the length of the hypotenuse (the side opposite the right angle) is equal to the sum of the squares of the lengths of the other two sides.

// The Pythagorean theorem can be expressed mathematically as:

// a² + b² = c²

// where a and b are the lengths of the legs of the right triangle, and c is the length of the hypotenuse.

// If a, b, and c are all positive integers, then they form a Pythagorean triplet if they satisfy the above equation.

// For example, (3, 4, 5) is a Pythagorean triplet, because:

// 3² + 4² = 9 + 16 = 25 = 5²

// Other examples of Pythagorean triplets include (5, 12, 13), (8, 15, 17), and (7, 24, 25).

import java.util.*;
public class Pythagorean_Triplet_Or_Not72{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of first leg of the right triangle: ");
        int a = input.nextInt();
        System.out.println("Enter the length of second leg of the right triangle: ");
        int b = input.nextInt();
        System.out.println("Enter the length of the hypotenuse: ");
        int c = input.nextInt();
        System.out.println("("+a+", "+b+", "+c+") is a "+pythagoreanTriplet(a, b, c)+" triplet");
    }

    static String pythagoreanTriplet(int a, int b, int c) {
        if (Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2))) {
            return "Pythagorean";
        } else {
            return "Not Pythagorean";
        }
    }

}