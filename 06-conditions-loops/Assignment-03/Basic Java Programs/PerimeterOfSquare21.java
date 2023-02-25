// Perimeter Of Square

// The perimeter of a square is given by the formula:

// P = 4s

// where P is the perimeter of the square and s is the length of one of its sides.

import java.util.*;

public class PerimeterOfSquare21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of one of square side: ");
        int s = input.nextInt();
        System.out.println("Perimeter Of Rectangle is: " +  (4 * s));
    }
}