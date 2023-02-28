// Define a method that returns the product of two numbers entered by user.


import java.util.*;
public class Product_Of_Two_Numbers66{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = input.nextInt();
        System.out.println("Enter num2: ");
        int num2 = input.nextInt();
        System.out.println("Product of "+ num1 +" and "+ num2 +" is: "+ product(num1, num2) +".");
    }

    static int product(int num1, int num2) {
        return num1 * num2;
    }
}