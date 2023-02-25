// Perimeter Of Circle

// The perimeter of a circle is also known as its circumference, and it can be calculated using the following formula:

// C = 2 * π * r

// where C is the circumference (perimeter) of the circle, π (pi) is a mathematical constant approximately equal to 3.14159, and r is the radius of the circle.

import java.util.*;

public class PermeterOfCircle17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        int r = input.nextInt();
        System.out.println("Perimeter Of Circle is: " + ( (int)(2 * (3.14159) * r)));
    }
}