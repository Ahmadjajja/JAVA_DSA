// Power In Java
//  for example
//  the value of 2 raised to the power of 3 is 8

import java.util.*;

public class PowerInJava42{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number as a Base for calculating power: ");
        int base = input.nextInt();
        System.out.println("Enter any number as a exponent for calculating power: ");
        int exponent = input.nextInt();
        System.out.println("the value of "+ base +" raised to the power of "+ exponent +" is: " + (int)Math.pow(base, exponent));
        
    }
}