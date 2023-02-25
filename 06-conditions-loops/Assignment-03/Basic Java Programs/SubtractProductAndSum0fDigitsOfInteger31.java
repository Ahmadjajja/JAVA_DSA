// Subtract the Product and Sum of Digits of an Integer

// Input: n = 234
// Output: 15 
// Explanation: 
// Product of digits = 2 * 3 * 4 = 24 
// Sum of digits = 2 + 3 + 4 = 9 
// Result = 24 - 9 = 15
import java.util.*;

public class SubtractProductAndSum0fDigitsOfInteger31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int productOfDIgits = 1;
        int sumOfDigits = 0;
        int temp = input.nextInt();
        int diffBwProAndSumOfDigits = 0;
        while ( temp > 0 ){
            int rem = temp % 10;
            productOfDIgits *= rem;
            sumOfDigits += rem;

            temp = temp / 10;
        }
        diffBwProAndSumOfDigits = productOfDIgits - sumOfDigits;
        System.out.println("diffBwProAndSumOfDigits" + diffBwProAndSumOfDigits);
        // return diffBwProAndSumOfDigits;
    }
}
