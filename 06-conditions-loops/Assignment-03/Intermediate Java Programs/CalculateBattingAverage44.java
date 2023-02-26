// Calculate Batting Average

// Batting average is a statistic used in cricket and baseball to measure a batter's performance. In cricket, batting average
// is the total number of runs scored by a player divided by the number of times they have been dismissed (outs). In baseball, 
// batting average is the total number of hits divided by the total number of at-bats.

// Here's how to calculate batting average in cricket and baseball:

// Cricket:
// Batting average = Total runs scored ÷ Number of times dismissed







import java.util.*;

public class CalculateBattingAverage44{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Total runs scored: ");
        int totalRunsScored = input.nextInt();
        System.out.println("Number of times dismissed: ");
        int NoOfTimesDismissed = input.nextInt();
        System.out.println("Batting average: "+ (totalRunsScored / (NoOfTimesDismissed + 0.0)));   // 0.0 uses here for converting int to float type of value
        
    }
}
