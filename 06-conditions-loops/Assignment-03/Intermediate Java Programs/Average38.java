// Calculate Average Of N Numbers

import java.util.*;
public class Average38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int averageOf3Numbers = (num1 + num2 + num3) / 3;
        System.out.println("average of 3 numbers is : " + averageOf3Numbers);
    }
}
