// Volume Of Cylinder

// The formula for the volume of a cylinder is:

// V = π * r^2 * h

// where V is the volume of the cylinder, π (pi) is a mathematical constant approximately equal to 3.14159, r is the radius of the base of the cylinder, and h is the height of the cylinder.


import java.util.*;

public class VolumeOfCylinder25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the base of the cylinder and the height of the cylinder: ");
        int r = input.nextInt();
        int h = input.nextInt();
        System.out.println("Volume Of Cylinder is: " +  ((int)((3.14159) * Math.pow(r, 2) * h)));
    }
}