// Find Ncr & Npr

// NCR (Permutation with repetition) and NPR (Permutation without repetition) are two mathematical concepts that are often used in counting and probability problems.

// NCR stands for "n choose r," which represents the number of ways to choose r items from a set of n items, allowing for repetition of items. NCR is calculated as:

// NCR = n^r / (r!)

// For example, suppose you have five different colors of balls and you want to choose three of them to create a combination. In this case, you can choose the same color ball multiple times. So the total number of combinations is:

// NCR = 5^3 / (3!) = 125 / 6 = 20.83

// So there are 20 different combinations of three balls that can be chosen from the five different colors, allowing repetition.

// NPR stands for "n permute r," which represents the number of ways to arrange r items from a set of n items, without repetition of items. NPR is calculated as:

// NPR = n! / (n - r)!

// For example, suppose you have six different colored balls and you want to choose three of them to create a sequence. In this case, you cannot choose the same color ball multiple times. So the total number of sequences is:

// NPR = 6! / (6 - 3)! = 6! / 3! = 120

// So there are 120 different sequences of three balls that can be chosen from the six different colors, without repetition.

// In summary, NCR allows for repetition of items while NPR does not allow repetition of items.




import java.util.*;

public class NcrAndNpr50 {
    //psvm : type this for boilerplate

    static int factorial(int n){
        int f = 1;
        for (int index = 1; index <= n; index++) {
            f *= index;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter color of balls for Ncr:");
        int n1 = input.nextInt();
        System.out.println("Enter color of balls for Npr:");
        int n2 = input.nextInt();
        System.out.println("Enter number of ways to choose color:");
        int r = input.nextInt();

        
        // n^r / (r!)
        System.out.println("Ncr : " +  Math.round((Math.pow(n1, r) / factorial(r)) * 100.0) / 100.0);
        System.out.println("Npr : " +  (factorial(n2) / factorial(n2 - r) ));


    }
}
