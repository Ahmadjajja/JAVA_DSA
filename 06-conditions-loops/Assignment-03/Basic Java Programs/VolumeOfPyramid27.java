// Volume Of Pyramid

// The formula for the volume of a pyramid depends on the shape of its base. For a pyramid with a rectangular base, the formula is:

// V = (1/3) * l * w * h

// where V is the volume of the pyramid, l is the length of the base, w is the width of the base, and h is the height of the pyramid.

import java.util.*;

public class VolumeOfPyramid27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the base, the width of the base and the height of the pyramid: ");
        int l = input.nextInt();
        int w = input.nextInt();
        int h = input.nextInt();
        System.out.println("Volume Of Pyramid is: " +  ((int) ((1 * l * w * h) / 3) ));
    }
}