// Perimeter Of Equilateral Triangle

// The perimeter of an equilateral triangle is given by the formula:

// P = 3s

// where P is the perimeter of the equilateral triangle and s is the length of one of its sides.



import java.util.*;

public class PermeterOfEquilateralTriangle18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of one of equilateral triangle sides: ");
        int s = input.nextInt();
        System.out.println("Perimeter Of Equilateral Triangle is: " +  (3 * s));
    }
}