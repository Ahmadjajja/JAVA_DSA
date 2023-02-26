// Armstrong Number
// An Armstrong number is a number that is equal to the sum of its
// own digits raised to the power of the number of digits.
// For example, 153 is an Armstrong number because it has 3 digits 
// and 1^3 + 5^3 + 3^3 = 153.

import java.util.*;

public class ArmstrongNumber49 {
    //psvm : type this for boilerplate
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = input.nextInt();
        int armstrong = 0;
        for (int index = 0; index < String.valueOf(num).length(); index++) {
            armstrong += (int)(Math.pow(Character.getNumericValue(Integer.toString(num).charAt(index)), 3));
        }
        if (num == armstrong) {
            System.out.println(num + " is Armstrong Number");
        } else {
            System.out.println(num + " is not Armstrong Number");
        }

    }
}