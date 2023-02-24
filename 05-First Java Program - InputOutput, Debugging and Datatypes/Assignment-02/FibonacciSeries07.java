// To calculate Fibonacci Series up to n numbers.

import java.util.*;

public class FibonacciSeries07 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length for Fibonacci Series sequence!");
        int FibonacciSeriesLength = input.nextInt();
        System.out.print(num1 + " , ");
        System.out.print(num2 + " , ");
        for (int i = 3; i <= FibonacciSeriesLength; i++) {
            if (i == FibonacciSeriesLength) {
                System.out.print((num1 + num2));
            } else {
                System.out.print((num1 + num2)+ " , " );
            }
            int temp = num1;
            num1 = num2;
            num2 = temp + num2;
        }
    }
}
