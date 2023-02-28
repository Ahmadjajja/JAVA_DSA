// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.


import java.util.*;
public class Min_And_Max_From_3_Nums62{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = input.nextInt();
        System.out.println("Enter num2: ");
        int num2 = input.nextInt();
        System.out.println("Enter num3: ");
        int num3 = input.nextInt();
        System.out.println("Maximum number between "+ num1 +", "+ num2 +" and "+ num3 +" is: "+ max(num1, num2, num3) +" ");
        System.out.println("Minimum number between "+ num1 +", "+ num2 +" and "+ num3 +" is: "+ min(num1, num2, num3) +" ");
    }

    static int min(int num1, int num2, int num3) {
        int min;
        if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }
        
        return min;
    }
    static int max(int num1, int num2, int num3) {
        int max;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        
        return max;
    }
}