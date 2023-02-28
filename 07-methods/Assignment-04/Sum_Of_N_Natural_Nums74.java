// Write a function that returns the sum of first n natural numbers.

// Natural numbers are a set of counting numbers that are used to represent quantities
// or objects. The set of natural numbers starts with 1 and includes all positive integers
// up to infinity. The first few natural numbers are 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, and so on.

import java.util.*;
public class Sum_Of_N_Natural_Nums74{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int n = input.nextInt();
        System.out.println("Sum of first "+ n +" natural numbers is "+ SumOf_N_NaturalNums(n) +".");
    }

    static int SumOf_N_NaturalNums(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}