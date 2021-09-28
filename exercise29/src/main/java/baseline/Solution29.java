/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.Scanner;

/*
Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it will
take to double your investment.
The formula is
years = 72 / r
where r is the stated rate of return.
    Don’t allow the user to enter 0.
    Don’t allow non-numeric values.
    Use a loop to trap bad input, so you can ensure that the user enters valid values.
 */

public class Solution29 {
    final String ERRORMESSAGE = "Sorry. That's not a valid input.";

    public static void main(String[] args) {
        //Prompt for the rate of return.
        //While true:
            //If entered number is greater than zero, try to return it as a double.
                //Else, print error message.
            //If NFE is caught, print error message.
        //Calculate (72 / rate of return), rounded up.
        //Output statement with return rate cast to int.
    }
}
