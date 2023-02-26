// Calculate Depreciation of Value

// Depreciation is the decrease in the value of an asset over
// time due to wear and tear, obsolescence, or other factors.

// The formula for calculating depreciation using the straight-line method is:

// Depreciation per year = (Cost of asset - Salvage value) ÷ Useful life of asset in years

// Depreciation per year = ($10,000 - $2,000) ÷ 5 = $1,600

import java.util.*;

public class CalculateDepreciationOfValue43{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Cost of asset: ");
        int costOfAsset = input.nextInt();
        System.out.println("Enter Salvage value: ");
        int salvageValue = input.nextInt();
        System.out.println("Enter Useful life of asset in years: ");
        int usefullLifeOfAssetInYear = input.nextInt();
        System.out.println("the value of $"+ ((costOfAsset - salvageValue) / usefullLifeOfAssetInYear));
        
    }
}