// Area Of Rhombus

// The formula for the area of a rhombus is:

// A = (d1 * d2) / 2

// where A is the area of the rhombus, and d1 and d2 are the lengths of the diagonals of the rhombus.


import java.util.*;

public class AreaOfRhombus15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the diagonal1 and diagonal2 of Rhombus: ");
        int d1 = input.nextInt();
        int d2 = input.nextInt();
        System.out.println("Area of Rhombus is: " + ((d1 * d2) / 2));
    }
}

