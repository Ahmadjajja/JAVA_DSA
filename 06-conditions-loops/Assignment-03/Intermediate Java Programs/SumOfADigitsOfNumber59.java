
import java.util.Scanner;

public class SumOfADigitsOfNumber59 {
    public static void main(String[] args) {
        System.out.println("Input any number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sumOfDigits = 0;
        for (int i = 0; i < Integer.toString(number).length(); i++) {
            sumOfDigits += Integer.parseInt(Character.toString(Integer.toString(number).charAt(i)));
        }
        System.out.println("Sum of "+number+"'s digits is: " + sumOfDigits);
    }
}
