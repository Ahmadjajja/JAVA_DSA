// Calculate Commission Percentage
// The formula for calculating commission percentage is:

// Commission percentage = (Commission amount ÷ Total sale amount) x 100%

// For example, if you made $500 in commission on total sales of $10,000, the commission percentage would be:

// Commission percentage = ($500 ÷ $10,000) x 100%
// Commission percentage = 0.05 x 100%
// Commission percentage = 5%



import java.util.*;
import java.util.function.IntConsumer;
public class CalculateCommisionPercentage41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Commission amount: ");
        double commissionAmount = input.nextDouble();
        System.out.println("Enter Total sale amount: ");
        double totalSaleAmount = input.nextDouble();
        double commissionPercentage = (commissionAmount / totalSaleAmount) * 100 ;
        System.out.println("commission percentage: " + (int)commissionPercentage + "%");
    }
}