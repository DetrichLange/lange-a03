/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.Arrays;
import java.util.Scanner;

/*
Create a program that determines the complexity of a given password based on these rules:
A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
If a password does not meet any of these rules, then report it as a password of unknown strength.
    Create a passwordValidator function that takes in the password as its argument and returns a numeric value you can
    evaluate to determine the password strength.
    Use a single output statement.
 */

public class Solution25 {
    static final Scanner userInput = new Scanner(System.in);

    private String promptPassword(){

    }

    public int passwordValidator(String inputPassword){
        //Convert inputPassword string to char array
        //For each char in the array:
            //If int = char is >47 and <58, add +1 to passwordNumbers and passwordLength
            //If int = char is >64 and <91, or >96 and <23, add +1 to passwordLetters and passwordLength
            //Else, add +1 to passwordSpecial and passwordLength
        //If passwordLength < 8, passwordLetters is 0, and passwordSpecial is 0, return 1
        //Else if passwordLength < 8, passwordNumbers is 0, and passwordSpecial is 0, return 2
        //Else if passwordLength >= 8, passwordLetters >0, passwordNumbers >0, and passwordSpecial is 0, return 3.
        //Else if passwordLength >= 8, passwordLetters >0, passwordNumbers >0, and passwordSpecial >0, return 4.
        //Else return 5.
    }

    private void outputResult(String inputPassword, int passwordStrength){
        //Use switch case based on int passwordStrength
            //Case 1, set outputString to "very weak"
            //Case 2, set outputString to "weak"
            //Case 3, set outputString to "strong"
            //Case 4, set outputString to "very strong"
            //Case 5, set outputString to "unknown strength"
        //Print "The password (inputPassword) is a (passwordStrength) password."
    }

    public static void main(String[] args){
        //Create an object
        Solution25 solutionApp = new Solution25();

        //Prompt user for password and save to string
        String inputPassword = solutionApp.promptPassword();

        //Call passwordValidator, sending returned int to outputResult
        solutionApp.outputResult(inputPassword, solutionApp.passwordValidator(inputPassword));
        }
    }
}
