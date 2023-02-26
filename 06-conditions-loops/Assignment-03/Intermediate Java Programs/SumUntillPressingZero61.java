// Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.


import java.util.Scanner;

public class SumUntillPressingZero61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, num ;
        while (true) {
            System.out.println("Input any number Or 0 for exit: ");
            num = input.nextInt();
            sum += num;
            if (num == 0) {
                break;
            }
        }
        System.out.println("sum : " + sum);
    }
}

