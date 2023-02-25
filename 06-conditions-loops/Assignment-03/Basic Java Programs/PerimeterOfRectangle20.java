// Perimeter Of Rectangle

// The perimeter of a rectangle is given by the formula:

// P = 2l + 2w

// where P is the perimeter of the rectangle, l is the length of the rectangle, and w is the width of the rectangle.

import java.util.*;

public class PerimeterOfRectangle20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle and also the width of the rectangle: ");
        int l = input.nextInt();
        int w = input.nextInt();
        System.out.println("Perimeter Of Rectangle is: " +  ((2 * l) + (2 * w)));
    }
}