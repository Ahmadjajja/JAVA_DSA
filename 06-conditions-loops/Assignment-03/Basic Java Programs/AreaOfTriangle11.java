// Area Of Triangle

// The formula for the area of a triangle is:

// A = 1/2 * b * h

// Where A is the area of the triangle, b is the length of the base of the triangle, and h is the height of the triangle.


import java.util.*;

public class AreaOfTriangle11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the base of triangle: ");
        int b = input.nextInt();
        System.out.println("Enter the height of triangle: ");
        int h = input.nextInt();
        System.out.println(h);
        System.out.println(b);
        System.out.println("AreaOfTriangle is: " + ( (1 * b * h)/2));
    }
}