// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.*;

public class Calculator04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        input.nextLine(); // consume the newline character
        System.out.println("Enter a operator in between +, -, *, %, / ");
        char operator = input.nextLine().charAt(0);

        if (operator != '+' || operator != '-' || operator != '*' || operator != '/' || operator != '%') {
            System.out.println("Invalid Operator!");
        }
        if (operator == '+') {
            System.out.println(num1 + " + " + num2 + "=" + (num1 + num2));
        } else if (operator == '-') {
            System.out.println(num1 + " - " + num2 + "=" + (num1 - num2));
        } else if (operator == '*') {
            System.out.println(num1 + " * " + num2 + "=" + (num1 * num2));
        } else if (operator == '/') {
            System.out.println(num1 + " + " + num2 + "=" + (num1 / num2));
        } else if (operator == '%') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 % num2));
        }
    }
}
