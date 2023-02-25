//Area Of Equilateral Triangle

// The formula for the area of an equilateral triangle is:

// A = (sqrt(3) / 4) * s^2

// where A is the area of the equilateral triangle, and s is the length of one side of the triangle.


import java.util.*;

public class AreaOfEquilateralTriangle16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of one side of the triangle: ");
        int s = input.nextInt();
        System.out.println("Area of equilateral triangle is: " + ((int)((Math.sqrt(3) / 4) * Math.pow(s, 2))));

    }
}


