// HCF Of Two Numbers Program
// HCF stands for Highest Common Factor, which is the largest positive integer that divides two or more numbers without leaving a remainder. It is also known as Greatest Common Divisor (GCD). HCF is commonly used in various mathematical applications, including simplifying fractions, finding common denominators, and solving equations.

// To find the HCF of two or more numbers, we can use various methods, including prime factorization, factor trees, and division method. Let's understand this with an example:

// Example:
// Find the HCF of 24 and 36.

// Method 1: Prime factorization method
// Step 1: Prime factorize the numbers
// 24 = 2 x 2 x 2 x 3
// 36 = 2 x 2 x 3 x 3

// Step 2: Identify the common factors
// The common factors are 2 and 3

// Step 3: Multiply the common factors
// 2 x 2 x 3 = 12

// Therefore, the HCF of 24 and 36 is 12.

// Method 2: Factor tree method
// Step 1: Write the numbers in a factor tree
// 24 = 2 x 12 = 2 x 2 x 6 = 2 x 2 x 2 x 3
// 36 = 2 x 18 = 2 x 2 x 9 = 2 x 2 x 3 x 3

// Step 2: Identify the common factors
// The common factors are 2 and 3

// Step 3: Multiply the common factors
// 2 x 2 x 3 = 12

// Therefore, the HCF of 24 and 36 is 12.

// Method 3: Division method
// Step 1: Divide the larger number by the smaller number
// 36 ÷ 24 = 1 remainder 12

// Step 2: Divide the smaller number by the remainder
// 24 ÷ 12 = 2 remainder 0

// Step 3: The divisor at the last step is the HCF
// Therefore, the HCF of 24 and 36 is 12.

// All three methods yield the same HCF value, which is 12.




import java.util.*;
public class HCFOfTwoNumbers54 {
    // Gcd of u and v using recursive method

    static int HCF(int u, int v)
    {
        if (u == 0)
            return v;
        return HCF(v % u, u);
    }
 
 
    // The Driver method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int num1 = input.nextInt();
        System.out.println("Enter second num: ");
        int num2 = input.nextInt();
        System.out.println("HCF of " + num1 + " and " + num2
                           + " is " + HCF(num1, num2));
    }
}