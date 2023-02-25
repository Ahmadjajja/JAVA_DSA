// Input a number and print all the factors of that number (use loops).

// The factors of a number are the positive integers that divide the number 
// without leaving a remainder. For example, the factors of 12 are 1, 2, 3, 4, 6, and 12,
// because each of these numbers can divide 12 without leaving a remainder.


import java.util.*;

public class printingAllFactorsOfNumber32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number for printing it's factors");
        int number = input.nextInt();
        System.out.println("All possible factors of " + number + " are: ");
        for (int i = 1; i <= number / 2; i++) {   //number / 2 : uses this for optimization 
            if (number % i == 0) {
                System.out.print(i + ", ");
            }
            if (i == number / 2) {
                System.out.print(number );
            }
        }
    }
}