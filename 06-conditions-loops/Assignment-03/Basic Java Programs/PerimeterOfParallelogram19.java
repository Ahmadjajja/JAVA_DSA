// Perimeter Of Parallelogram

// The perimeter of a parallelogram is given by the formula:

// P = 2a + 2b

// where P is the perimeter of the parallelogram, a is the length of one of its adjacent sides, and b is the length of the other adjacent side.


import java.util.*;

public class PerimeterOfParallelogram19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of one of its adjacent side and also the length of the other adjacent side: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Perimeter Of Parallelogram is: " +  ((2 * a) + (2 * b)));
    }
}