// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)


import java.util.*;

public class printingSumUntilEnterZero33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, number;
        while (true) {
            System.out.println("Enter any number for Sum OR 0 for Exit: ");
            number = input.nextInt();
            if (number == 0) {
                break;
            } else {
                sum += number;
            }
        }
        System.out.println("Sum of numbers are: " + sum);
    }
}