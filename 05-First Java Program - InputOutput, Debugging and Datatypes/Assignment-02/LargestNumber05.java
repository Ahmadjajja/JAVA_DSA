// Take 2 numbers as input and print the largest number.


import java.util.*;

public class LargestNumber05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        if (num2 > num1 ) {
            System.out.println(num2 + " is greater then " + num1);
        } else {
            System.out.println(num1 + " is greater then " + num2);
        }
    }
} 
