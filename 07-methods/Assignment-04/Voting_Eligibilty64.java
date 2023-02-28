// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.


import java.util.*;
public class Voting_Eligibilty64{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age of voter: ");
        int num = input.nextInt();
        System.out.println("Voter is " + eligibilty(num) + " to vote");
    }

    static String eligibilty(int num) {
        String eligibility = "";
        if (num > 18 ) {
            eligibility = "Eligible";
        } else {
            eligibility = "Not Eligible";
        }
        
        return eligibility;
    }
}