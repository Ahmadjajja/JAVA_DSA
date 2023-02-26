// Calculate Average Marks

// To calculate the average (also known as the mean) of a set of marks, you can use the following formula:

// Average marks = (sum of all marks) / (number of marks)

// For example, let's say you have five exam scores: 75, 80, 85, 90, and 95. To calculate the average mark, you would add up all the marks and then divide by the number of marks. Here's how to do it:

// Average marks = (75 + 80 + 85 + 90 + 95) / 5
// Average marks = 425 / 5
// Average marks = 85

import java.util.*;

public class CalculateAverageMarks47{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks of 4 subjects");
        System.out.println("Average of four subjects is: " + (input.nextInt() + input.nextInt() +input.nextInt() +input.nextInt() ) / 4);
    }
}
