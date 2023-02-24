// To find Armstrong Number between two given number.

// An Armstrong number is a number that is equal to the sum of its
// own digits raised to the power of the number of digits.
// For example, 153 is an Armstrong number because it has 3 digits 
// and 1^3 + 5^3 + 3^3 = 153.

import java.util.*;

public class ArmStrongNumberBetweenTwoNumbers09 {
    //psvm : type this for boilerplate
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        int armstrong = 0;
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = num1; i < num2; i++) {
            for (int index = 0; index < String.valueOf(i).length(); index++) {
                armstrong += (int)(Math.pow(Character.getNumericValue(Integer.toString(i).charAt(index)), 3));
            }
            if (armstrong == i) {
                break;
            } else {
                armstrong = 0;
            }
        } 
        System.out.println("First armstrong number between " + num1 + " and " + num2 + " is " + armstrong);
    }
}
