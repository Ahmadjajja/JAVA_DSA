// Write a function to find if a number is a palindrome or not. Take number as parameter.


// For example, the following strings are palindrome strings:

// "racecar"
// "deified"
// "level"
// "A man a plan a canal Panama"

import java.util.*;
public class Palindrome_Or_Not71{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any num: ");
        int num = input.nextInt();
        System.out.println(num + " is " + palindrome(num) + " Number");
    }

    static String palindrome(int num) {
        String palindromeChecking = "";
        String str = String.valueOf(num);
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
            palindromeChecking = "Palindrome";
        } else {
            palindromeChecking = "Not Palindrome";
        }
        
        return palindromeChecking;
    }
}