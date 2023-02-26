
import java.util.Scanner;

public class LeapYearOrNot58 {
    public static void main(String[] args) {
        System.out.println("Input any year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        // System.out.println("year: " + year);

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is leap year");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }
}
