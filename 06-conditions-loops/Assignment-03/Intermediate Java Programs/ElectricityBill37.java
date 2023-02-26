// Calculate Electricity Bill

// a general formula for calculating the electricity bill is as follows:

// Electricity bill = (Energy consumed in kWh) x (Rate per kWh) + Fixed charges + Taxes and other fees

// For example, suppose a household consumes 500 kWh of electricity during a billing period, and the utility company charges a rate of $0.15 per kWh, a fixed charge of $10, and a tax of 5%. The electricity bill would be:

// Electricity bill = (500 kWh) x ($0.15/kWh) + $10 + 5% of [(500 kWh) x ($0.15/kWh) + $10]
// Electricity bill = $75 + $10 + $4.25
// Electricity bill = $89.25

import java.util.*;

public class ElectricityBill37{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Energy consumed in kWh: ");
        double energyConsumed = input.nextDouble();
        System.out.println("Enter Rate per kWh: ");
        double rate = input.nextDouble();
        System.out.println("Enter Fixed charges: ");
        double fixedCharges = input.nextDouble();
        System.out.println("Enter Taxes and other fees: ");
        double taxesAndOtherFee = input.nextDouble();
        double electricityBill = energyConsumed * rate * fixedCharges * taxesAndOtherFee;

        System.out.println("Electricity bill is $" + ((int)(electricityBill)));

    }
}

