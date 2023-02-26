//Sum Of N Numbers


import java.util.*;

public class SumOfNNumbers48{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of N");
        int N = input.nextInt();
        int sum = 0;
        System.out.println("Enter "+ N +" values for sum:");
        for (int i = 0; i < N; i++) {
            sum += input.nextInt();
        }
        System.out.println("Sum of given "+ N +" numbers is: " + sum);
    }
}
