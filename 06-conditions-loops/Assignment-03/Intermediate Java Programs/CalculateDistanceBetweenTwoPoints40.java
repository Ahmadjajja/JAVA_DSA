// Calculate Distance Between Two Points

// To calculate the distance between two points in a two-dimensional plane, you can use the distance formula:

// Distance = sqrt((x2 - x1)^2 + (y2 - y1)^2)

// In this formula, (x1, y1) and (x2, y2) are the coordinates of the two points. The "^2" symbol means "squared," and "sqrt" means "square root."

// For example, suppose you want to find the distance between the points (2, 3) and (5, 7). Using the distance formula, the distance can be calculated as:

// Distance = sqrt((5 - 2)^2 + (7 - 3)^2)
// Distance = sqrt(3^2 + 4^2)
// Distance = sqrt(9 + 16)
// Distance = sqrt(25)
// Distance = 5

// Therefore, the distance between the points (2, 3) and (5, 7) is 5 units. Note that the units of distance depend on the units used for the coordinates (e.g., inches, meters, etc.)

import java.util.*;
public class CalculateDistanceBetweenTwoPoints40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of point-1 for x-axis and y-axis ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        System.out.println("Enter value of point-2 for x-axis and y-axis ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Therefore, the distance between the points ("+ x1 +", "+ y1 +") and ("+ x2 +", "+ y2 +") is "+ (int)distance +" units");
    }
}
