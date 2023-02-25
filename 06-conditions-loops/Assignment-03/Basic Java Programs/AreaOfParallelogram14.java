// Area Of Parallelogram

// The formula for the area of a parallelogram is:

// A = b * h

// where A is the area of the parallelogram, b is the length of the base of the parallelogram, and h is the height of the parallelogram.

import java.util.*;

public class AreaOfParallelogram14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the base and the height of the parallelogram: ");
        int b = input.nextInt();
        int h = input.nextInt();
        System.out.println("Area of parallelogram is: " + (b * h));
    }
}
