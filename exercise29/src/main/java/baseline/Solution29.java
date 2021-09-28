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
    static final String ERRORMESSAGE = "Sorry. That's not a valid input.";
    Scanner userInput = new Scanner(System.in);

    private String promptRate(){
        System.out.println("What is the rate of return?");
        return userInput.nextLine();
    }

    public boolean checkRateValid(String userInput){
        double rateOfReturn;

        try{
            rateOfReturn = Double.parseDouble(userInput);
        }catch(NumberFormatException nfe){
            System.out.println(ERRORMESSAGE);
            return false;
        }

        if(rateOfReturn <= 0){
            System.out.println(ERRORMESSAGE);
            return false;
        }
        else{
            return true;
        }
    }

    private void printOutput(String userInput){
        System.out.printf("It will take %d years to double your initial investment.",
                (int)Math.ceil(Double.parseDouble(userInput)));
    }

    public static void main(String[] args) {
        Solution29 solutionApp = new Solution29();

        while(true) {
            String userInput = solutionApp.promptRate();
            if (solutionApp.checkRateValid(userInput)) {
                solutionApp.printOutput(userInput);
                break;
            }
        }
    }
}
