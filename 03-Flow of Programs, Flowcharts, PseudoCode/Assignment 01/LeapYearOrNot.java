import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[] args){
        System.out.println("Input any year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        // System.out.println("year: " + year);

        if(year % 4 == 0 ){
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }
}