// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.*;

public class findingLargestNumFromAllUntillEnterZero34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int count = 0;
        int max = 0;
        while (true) {
            System.out.println("Enter any number OR 0 for Exit: ");
            number = input.nextInt();
            if (number == 0) {
                break;
            } else {
                nums.add(number);
                if (count == 0) {
                    max = nums.get(0);
                } else {
                    if (max < nums.get(count)) {
                        max = nums.get(count);
                    }
                }
                count++;
            }
        }
        System.out.println("The largest number from all is " + max);
    }
}