// Write a program that will ask the user to enter his/her marks (out of 100).

// Define a method that will display grades according to the marks entered as below:

// Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail 

import java.util.*;

public class Grade_Counter69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks;
        while (true) {
            System.out.println("Enter your gained marks out of 100: ");
            marks = input.nextInt();
            if (marks <= 100 && marks >= 0) {
                break;
            } else {
                System.out.println("Invalid marks!");
            }
        }
        if (grade(marks) == "FAIL") {
            System.out.println("You are Failed, Don't lose hope because failures are part of life. Try again...");
        } else {
            System.out.println("You have got "+grade(marks) + " Grade");
        }
    }

    static String grade(int marks) {
        if (marks > 90 && marks <= 100) {
            return "AA";
        } else if (marks > 80 && marks <= 100) {
            return "AB";
        } else if (marks > 70 && marks <= 80) {
            return "BB";
        } else if (marks > 60 && marks <= 70) {
            return "BC";
        } else if (marks > 50 && marks <= 60) {
            return "CD";
        } else if (marks > 40 && marks <= 50) {
            return "DD";
        }  else {
            return "FAIL";
        }
    }
}