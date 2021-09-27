/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.Scanner;

/*
Write a program that will help you determine how many months it will take to pay off a credit card balance. The program
should ask the user to enter the balance of a credit card, the APR of the card, and their monthly payment. The program
should then return the number of months needed (rounded up to the next integer value).
The formula for this is
n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
where
n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.
    Prompt for the card’s APR. Do the division internally.
    Prompt for the APR as a percentage, not a decimal.
    Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff, which takes no
    parameters and returns the number of months.
    Round fractions of a cent up to the next cent for internal calculations
 */

public class Solution26 {
    static final Scanner userInput = new Scanner(System.in);

    private double promptDouble(String whichValue){
        //Loop while true:
            //Print message asking user "What is (whichValue)?"
            //Try to return user input as double
                //Catch NFE, prompt user to enter only numbers (repeat loop)
        while(true){
            System.out.printf("What is %s?%n", whichValue);
            try{
                return Double.parseDouble(userInput.nextLine());
            }catch(NumberFormatException nfe){
                System.out.printf("Please enter a number.%n");
            }
        }
    }

    private void outputStatement(int numberOfMonths){
        System.out.printf("It will take you %d months to pay off this card.", numberOfMonths);
    }

    public static void main(String[] args){
        //Create Solution26 object named solutionApp
        Solution26 solutionApp = new Solution26();

        //Call solutionApp.promptDouble three times to ask for "your balance", "the APR on the card (as a percent)", and
        //"the monthly payment you can make"
        double userBalance = solutionApp.promptDouble("your balance");
        double userAPR = solutionApp.promptDouble("the APR on the card (as a percent)") / 100;
        double userPayment = solutionApp.promptDouble("the monthly payment you can make");

        //Construct new PaymentCalculator named solutionCalculator using the three retrieved values as arguments
        PaymentCalculator solutionCalculator = new PaymentCalculator(userBalance, userAPR, userPayment);

        //Set int numberOfMonths = solutionCalculator.calculateMonthsUntilPaidOff()
        int numberOfMonths = solutionCalculator.calculateMonthsUntilPaidOff();

        //Print output statement using numberOfMonths
        solutionApp.outputStatement(numberOfMonths);
    }
}
