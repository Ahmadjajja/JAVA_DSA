// Curved Surface Area Of Cylinder

// The formula for the curved surface area of a cylinder is:

// A = 2 * π * r * h

// where A is the curved surface area of the cylinder, π (pi) is a mathematical constant approximately equal to 3.14159, r is the radius of the base of the cylinder, and h is the height of the cylinder.

import java.util.*;

public class CurvedSurfaceAreaOfCylinder28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the base of the cylinder and the height of the cylinder: ");
        int r = input.nextInt();
        int h = input.nextInt();
        System.out.println("Curved Surface Area Of Cylinder is: " +  ( (int) (2 * (3.14159) * r * h) ));
    }
}