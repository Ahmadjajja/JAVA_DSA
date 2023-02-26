
// Calculate Discount Of Product

// To calculate the discount of a product, you need to know the original price of the product and the discount rate that is being offered. The discount rate is usually expressed as a percentage, and it represents the proportion of the original price that is being subtracted.

// The formula for calculating the discount amount is:

// Discount = Original price x Discount rate

// For example, suppose a product has an original price of $100, and a discount of 20% is being offered. The discount amount can be calculated as:

// Discount = $100 x 0.20
// Discount = $20

// Therefore, the discount amount for the product is $20.

import java.util.*;
public class DiscountOfProduct39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the original price of the product in $: ");
        int originalPrice = input.nextInt();
        System.out.println("Enter the discount rate as a decimal fraction instead of a percentage less than 1: ");
        double discountRate = input.nextDouble();
        double discount = originalPrice * discountRate;
        System.out.println("Therefore, the discount amount for the product is $" + (int)discount);
    }
}
