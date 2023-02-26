// Compound Interest Java Program

// Let's say you have $10,000 that you want to invest for 5 years at an annual interest rate of 5%. You want to know how much your investment will be worth after the 5-year period.

// Using the compound interest formula, we have:
// A = P(1 + r/n)^(nt)

// where:

// P = $10,000 (the principal amount(initial))
// r = 5% (the annual interest rate expressed as a decimal)       5% = 0.05
// n = 1 (the number of times interest is compounded per year, which is once annually)
// t = 5 (the number of years)
// Plugging in the values, we get:

// A = $10,000(1 + 0.05/1)^(1*5)
// A = $10,000(1.05)^5
// A = $12,762.82


import java.util.*;

public class CompoundInterest46{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal amount(initial)");
        int p = input.nextInt();
        System.out.println("Enter the annual interest rate expressed as a decimal");
        double r = input.nextDouble();
        System.out.println("Enter the number of times interest is compounded per year, which is once annually");
        int n = input.nextInt();
        System.out.println("Enter the number of years");
        int t = input.nextInt();
        System.out.println("The final amount is $" + Math.round((p*(Math.pow((1 + (r / n)), (n*t))))* 100.0) / 100.0);

    }
}