// To find out whether the given String is Palindrome or not.

// For example, the following strings are palindrome strings:

// "racecar"
// "deified"
// "level"
// "A man a plan a canal Panama"

import java.util.*;

public class palindromOrNot52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any palindrome string: ");
        String str = input.nextLine();
        String strForwardSequence = "", strBackwardSequence = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                strForwardSequence += str.charAt(i);
            }
            if (str.charAt((str.length()-1) - i) != ' ' ) {
                strBackwardSequence += str.charAt((str.length()-1) - i);
            }
        }
        
        if (strForwardSequence.equalsIgnoreCase(strBackwardSequence)) {
            System.out.println(str + " is palindrome String");
        } else {
            System.out.println(str + " is not palindrome String");
        }
    }
}