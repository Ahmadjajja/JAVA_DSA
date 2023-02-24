// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
// Example 1: A person invests $5,000 in a fixed deposit account with a simple interest rate of 6% per year for 3 years. What is the interest earned?

// Simple Interest = (Principal x Rate x Time) / 100


import java.util.*;

public class SimpleInterest03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal in dollars, Rate in percentage, Time in years: ");
        int principal = input.nextInt();
        int rate = input.nextInt();
        int time = input.nextInt();
        int simpleInterest = (principal * rate * time) / 100;
        System.out.println("The interest earned on the investment after "+ time +" years is $"+ simpleInterest+".");
    }
} 
