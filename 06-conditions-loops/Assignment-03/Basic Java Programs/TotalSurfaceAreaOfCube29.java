// Total Surface Area Of Cube

// The formula for the total surface area of a cube is:

// A = 6 * s^2 

// where A is the total surface area of the cube, and s is the length of the side of the cube.

import java.util.*;

public class TotalSurfaceAreaOfCube29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the side of the cube: ");
        int s = input.nextInt();
        System.out.println("Total Surface Area Of Cube is: " +  ((int) (6 * Math.pow(s, 2)) ));
    }
}