// Future Investment Value

// Future Investment Value (FV) refers to the value that an investment will have at a specific point in the future, given a certain rate of return or interest rate. It is calculated by taking the present value of the investment and compounding it over a specified period.

// The formula for calculating FV is:

// FV = PV x (1 + r)^n

// Where:
// PV = Present value of the investment
// r = Annual interest rate or rate of return
// n = Number of years or periods of investment

// Let's take an example to understand this better:

// Suppose you invest $10,000 in a mutual fund that has an annual interest rate of 6% for a period of 5 years. Using the FV formula, we can calculate the future value of your investment after 5 years as:

// FV = $10,000 x (1 + 0.06)^5
// FV = $10,000 x 1.3382
// FV = $13,382

// So, the future value of your investment after 5 years would be $13,382.


// To find out whether the given String is Palindrome or not.

// For example, the following strings are palindrome strings:

// "racecar"
// "deified"
// "level"
// "A man a plan a canal Panama"

import java.util.*;

public class FutureInvestmentValue53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter present value of the investment: ");
        int pv = input.nextInt();
        System.out.println("Enter Annual interest rate or rate of return in floating value: ");
        double r = input.nextDouble();
        System.out.println("Enter Number of years or periods of investment: ");
        int n = input.nextInt();
        System.out.println("So, the future value of your investment after "+ n +" years would be $"+ (int)(pv * Math.pow((1 + r), n)) +".");
    }
}