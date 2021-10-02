/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.Random;
import java.util.Scanner;

/*
Create a program that generates a secure password. Prompt the user for the minimum length, the number of special
characters, and the number of numbers. Then generate a password for the user using those inputs.
    Use lists to store the characters you’ll use to generate the passwords.
    Ensure that the generated password is random.
    Ensure that there are at least as many letters are there are special characters and number.
 */

public class Solution37 {
    static final Scanner userInput = new Scanner(System.in);
    Random rng = new Random();

    private int promptInt(String promptMessage){

    }

    public String generatePassword(int minimumLength, int numberOfSpecialChars, int numberOfNumbers){

    }

    private char generateLetter(){

    }

    private char generateNumber(){

    }

    private char generateSpecial(){

    }

    public static void main(String[] args) {
        Solution37 solutionApp = new Solution37();

        //Make an arraylist of characters to store the password

        //Prompt user for minimum length
        int minimumLength = solutionApp.promptInt("What's the minimum length?");

        //Prompt user for number of special characters
        int numberOfSpecialChars = solutionApp.promptInt("How many special characters?");

        //Prompt user for number of numbers
        int numberOfNumbers = solutionApp.promptInt("How many numbers?");

        //Loop a number of times equal to numberOfSpecialChars:
            //Generate a special character and add it to the password list

        //Loop a number of times equal to numberOfNumbers:
            //Generate a number and add it to the password list

        //Figure out which is greater, numberOfNumbers + numberOfSpecialChars
        //or minimumLength - numberOfNumbers - numberOfSpecialChars
            //Loop that many times
                //Generate a random letter and add it to the list

        //Shuffle the list

        //Print the contents of the list
    }
}
