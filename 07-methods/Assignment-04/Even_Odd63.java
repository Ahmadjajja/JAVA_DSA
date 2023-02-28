// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.


import java.util.*;
public class Even_Odd63{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = input.nextInt();
        System.out.println(num + " is " + evenOdd(num) + " Number");
    }

    static String evenOdd(int num) {
        String evenOdd = "";
        if (num % 2 == 0) {
            evenOdd = "Even";
        } else {
            evenOdd = "Odd";
        }
        
        return evenOdd;
    }
}