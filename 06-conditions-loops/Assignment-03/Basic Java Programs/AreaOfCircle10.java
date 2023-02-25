// Area Of Circle Java Program

import java.util.*;

public class AreaOfCircle10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of radius of circle");
        int radius = input.nextInt();
        System.out.println("Area of circle :" + (2 * (3.14) * Math.pow(radius, 2)));
    }
}