// Area Of Rectangle

// The formula for the area of a rectangle is:

// A = l * w

// Where A is the area of the rectangle, l is the length of the rectangle, and w is the width of the rectangle.

import java.util.*;

public class AreaOfRectangle12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length and width of Rectangle: ");
        int l = input.nextInt();
        int w = input.nextInt();

        System.out.println("Area of Rectangle: " + (l * w));

    }
}