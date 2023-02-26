// Reverse A String In Java

import java.util.*;

public class ReverseAString51{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String forwardString = input.nextLine().trim();
        String reverseString = "";
        for (int i = forwardString.length() - 1; i >=0 ; i--) {
            reverseString += forwardString.charAt(i);
        }
        System.out.println("forwardString: " + forwardString);
        System.out.println("reverseString: " + reverseString);
    }
}