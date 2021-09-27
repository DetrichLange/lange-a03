/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.Scanner;

/*
Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid
according to these rules:
The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.
    Create a function for each validation rule. Then create a validateInput function that takes in all of the input
    data and invokes the specific validation functions.
    Use a single output statement to display the outputs.
 */

public class Solution27 {

    private String promptInput(String whichInput){
    }

    private boolean nameNotBlankRule(String inputName){
    }

    private boolean nameLengthRule(String inputName){
    }

    private boolean employeeIDFormatRule(String employeeID){
    }

    private boolean zipCodeNumberRule(String zipCode){
    }

    private void printOutput(String outputStatement){
    }

    public void validateInput(String firstName, String lastName, String employeeID, String zipCode){
    }

    public static void main(String[] args){
        //Create Solution27 object solutionApp
        //Set firstName = promptInput with argument "first name"
        //Do the same for lastName "last name", zip code "ZIP code", employeeID "employee ID"

        //Call validateInput with all four values
            //validateInput calls nameLengthRule with firstName
                //if false, add "The first name must be at least 2 characters long." to outputStatement
            //validateInput calls nameLengthRule with lastName
                //if false, add "The last name must be at least 2 characters long." to outputStatement
            //validateInput calls nameNotBlankRule with firstName
                //if false, add "The first name must be filled in." to outputStatement
            //validateInput calls nameNotBlankRule with firstName
                //if false, add "The last name must be filled in." to outputStatement
            //validateInput calls employeeIDFormatRule
                //if false, add "The employee ID must be in the format of AA-1234." to outputStatement
            //validateInput calls zipCodeNumberRule
                //if false, add "The zipcode must be a 5 digit number." to outputStatement

        //Call printOutput with outputStatement
    }
}
