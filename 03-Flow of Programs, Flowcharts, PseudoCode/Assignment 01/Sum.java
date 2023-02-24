// 5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.*;

public class Sum {
    
    public static void main(String[] args) {
        char x = ' ';
        int sum = 0;
        System.out.println("Enter any number for sum, x for quit!");
        while (x != 'x') {
            Scanner input = new Scanner(System.in);
            try {
                sum = sum + input.nextInt();
            } catch (Exception e) {
                x = input.nextLine().charAt(0);
                if (x != 'x') {
                    System.out.println("Note: Except numbers and x, there is no any other input allowed.");
                }
            }
        }
        System.out.println("sum : " + sum);
    }  
}
