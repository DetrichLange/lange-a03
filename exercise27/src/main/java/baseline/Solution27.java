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
    static final Scanner userInput = new Scanner(System.in);

    private String promptInput(String whichInput){
        System.out.printf("Enter the %s:%n", whichInput);
        return userInput.nextLine();
    }

    public boolean nameNotBlankRule(String inputName){
        return inputName.equals("");
    }

    public boolean nameLengthRule(String inputName){
        return inputName.length() < 2;
    }

    public boolean employeeIDFormatRule(String employeeID){
        if(employeeID.length() != 7){
            return true;
        }

        char[] convertedID = employeeID.toCharArray();

        if(!Character.isLetter(convertedID[0])){
            return true;
        }
        if(!Character.isLetter(convertedID[1])){
            return true;
        }
        if(convertedID[2] != 45){
            return true;
        }
        if(!Character.isDigit(convertedID[3])){
            return true;
        }
        if(!Character.isDigit(convertedID[4])){
            return true;
        }
        if(!Character.isDigit(convertedID[5])){
            return true;
        }
        return !Character.isDigit(convertedID[6]);
    }

    public boolean zipCodeNumberRule(String zipCode){
        if(zipCode.length() != 5){
            return true;
        }

        char[] convertedZIP = zipCode.toCharArray();

        for(char character : convertedZIP){
            if(!Character.isDigit(character)){
                return true;
            }
        }

        return false;
    }

    private void printOutput(String outputStatement){
        System.out.printf("%s", outputStatement);
    }

    public String validateInput(String firstName, String lastName, String employeeID, String zipCode){
        String outputStatement = "";
        //validateInput calls nameLengthRule with firstName
        //if false, add "The first name must be at least 2 characters long." to outputStatement
        if(nameLengthRule(firstName)){
            outputStatement += "The first name must be at least 2 characters long.\n";
        }

        //validateInput calls nameLengthRule with lastName
        //if false, add "The last name must be at least 2 characters long." to outputStatement
        if(nameLengthRule(lastName)){
            outputStatement += "The last name must be at least 2 characters long.\n";
        }

        //validateInput calls nameNotBlankRule with firstName
        //if false, add "The first name must be filled in." to outputStatement
        if(nameNotBlankRule(firstName)){
            outputStatement += "The first name must be filled in.\n";
        }

        //validateInput calls nameNotBlankRule with firstName
        //if false, add "The last name must be filled in." to outputStatement
        if(nameNotBlankRule(lastName)){
            outputStatement += "The last name must be filled in.\n";
        }

        //validateInput calls employeeIDFormatRule
        //if false, add "The employee ID must be in the format of AA-1234." to outputStatement
        if(employeeIDFormatRule(employeeID)){
            outputStatement += "The employee ID must be in the format of AA-1234.\n";
        }

        //validateInput calls zipCodeNumberRule
        //if false, add "The zipcode must be a 5 digit number." to outputStatement
        if(zipCodeNumberRule(zipCode)){
            outputStatement += "The zipcode must be a 5 digit number.\n";
        }

        return outputStatement;
    }

    public static void main(String[] args){
        //Create Solution27 object solutionApp
        Solution27 solutionApp = new Solution27();

        //Set firstName = promptInput with argument "first name"
        String firstName = solutionApp.promptInput("first name");

        //Do the same for lastName "last name", zip code "ZIP code", employeeID "employee ID"
        String lastName = solutionApp.promptInput("last name");
        String zipCode = solutionApp.promptInput("ZIP code");
        String employeeID = solutionApp.promptInput("employee ID");

        //Call validateInput with all four values
        String outputStatement = solutionApp.validateInput(firstName, lastName, employeeID, zipCode);

        //Call printOutput with outputStatement
        solutionApp.printOutput(outputStatement);

        if(outputStatement.equals("")){
            System.out.printf("There were no errors found.%n");
        }
    }
}
