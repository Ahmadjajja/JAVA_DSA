// Area Of Isosceles Triangle

// The formula for the area of an isosceles triangle is:

// A = 1/2 * b * h

// where A is the area of the isosceles triangle, b is the length of the base of the triangle, and h is the height of the triangle.
// If the length of the legs of the isosceles triangle is given, you can use the following formula to calculate the height:

// h = sqrt(l^2 - (b/2)^2)

// where l is the length of one of the legs of the isosceles triangle. Once the height is known, you can use the formula above to calculate the area of the isosceles triangle.

import java.util.*;

public class AreaOfIsoscelesTriangle13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the base and the length of one of the legs of the isosceles triangle: ");
        int b = input.nextInt();
        int l = input.nextInt();
        double h = Math.sqrt((double)(Math.pow(l, 2) - Math.pow((b/2), 2)));
        System.out.println("Area Of Isosceles Triangle is : " + (int)((1 * b * h)/2));

    }
}
