// Input currency in rupees and output in USD.

import java.util.*;

public class CurrencyConverter06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount in PKR:");
        int amountInPKR = input.nextInt();
        int amountInUSD = amountInPKR / 259;
        System.out.println(amountInPKR + " PKR " + " = " + amountInUSD + " USD");
    }
} 
