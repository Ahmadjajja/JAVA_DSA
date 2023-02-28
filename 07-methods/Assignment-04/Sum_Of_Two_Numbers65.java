// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.


import java.util.*;
public class Sum_Of_Two_Numbers65{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = input.nextInt();
        System.out.println("Enter num2: ");
        int num2 = input.nextInt();
        System.out.println("Sum of "+ num1 +" and "+ num2 +" is: "+ sum(num1, num2) +".");
    }

    static int sum(int num1, int num2) {
        return num1 + num2;
    }
}