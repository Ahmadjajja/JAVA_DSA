// Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.


import java.util.Scanner;

public class CoutingEvenDaysOfAugust60 {
    public static void main(String[] args) {
        int augustDays = 31, count = 0;
        for (int i = 2; i <= 31; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Kunal is allowed to go out with his friends only for "+count+" even days in august");
    }
}

