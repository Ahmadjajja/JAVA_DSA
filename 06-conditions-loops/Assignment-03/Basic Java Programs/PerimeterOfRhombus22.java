// Perimeter Of Rhombus

// The perimeter of a rhombus is given by the formula:

// P = 4s

// where P is the perimeter of the rhombus and s is the length of one of its sides.

import java.util.*;

public class PerimeterOfRhombus22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of one of Rhombus side: ");
        int s = input.nextInt();
        System.out.println("Perimeter Of Rhombus is: " +  (4 * s));
    }
}