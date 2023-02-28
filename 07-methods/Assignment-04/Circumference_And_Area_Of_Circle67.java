// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

// The formulas for circumference and area of circle are:

// Circle:

// Circumference: C = 2πr where r is the radius of the circle and π is the mathematical constant pi (approximately 3.14159).

// Area: A = πr² where r is the radius of the circle and π is pi.

import java.util.*;
public class Circumference_And_Area_Of_Circle67{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int radius = input.nextInt();
        System.out.println("Area of circle is: "+ (int)Area(radius));
        System.out.println("Circumference of circle is: "+ (int)circumference(radius));
    }

    static double Area(int r) {
        return 3.14159 * Math.pow(r, 2);
    }
    static double circumference(int r) {
        return 2* (3.14159) * r;
    }
}