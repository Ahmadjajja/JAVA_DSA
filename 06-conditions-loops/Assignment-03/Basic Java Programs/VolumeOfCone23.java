// Volume Of Cone

// The formula for the volume of a cone is:

// V = (1/3) * π * r^2 * h

// where V is the volume of the cone, π (pi) is a mathematical constant approximately equal to 3.14159, r is the radius of the base of the cone, and h is the height of the cone.

import java.util.*;

public class VolumeOfCone23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the base of the cone and the height of the cone: ");
        int r = input.nextInt();
        int h = input.nextInt();
        System.out.println("Volume Of Cone is: " +  ((int)(1 * (3.14159) * Math.pow(r, 2) * h) / 3));
    }
}