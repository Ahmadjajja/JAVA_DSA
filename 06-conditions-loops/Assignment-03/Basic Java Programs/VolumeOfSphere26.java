// Volume Of Sphere

// The formula for the volume of a sphere is:

// V = (4/3) * π * r^3

// where V is the volume of the sphere, π (pi) is a mathematical constant approximately equal to 3.14159, and r is the radius of the sphere.

import java.util.*;

public class VolumeOfSphere26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        int r = input.nextInt();
        System.out.println("Volume Of Sphere is: " +  ((int) ((4 * (3.14159) * Math.pow(r, 3)) / 3) ));
    }
}