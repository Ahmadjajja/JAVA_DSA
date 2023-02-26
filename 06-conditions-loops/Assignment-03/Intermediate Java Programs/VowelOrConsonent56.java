// LCM Of Two Numbers

// In English, vowels are the letters A, E, I, O, and U, while consonants are all the other letters of the alphabet.

// To determine whether a letter is a vowel or a consonant, you can simply check if the letter is A, E, I, O, or U.
// If the letter is any of these, it is a vowel, and if it is not, it is a consonant.

import java.util.*;

public class VowelOrConsonent56 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any character: ");
        String ch = input.next();

        if (ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") || ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u") ) {
            System.out.println(ch + " is vowel");
        } else {
            System.out.println(ch + " is consonent");
        }

    }
}