/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.Scanner;

/*
Create a program that prompts for a list of numbers, separated by spaces. Have the program print out a new list
containing only the even numbers.
    Convert the input to an array. Many languages can easily convert strings to arrays with a built-in function that
    splits apart a string based on a specified delimiter.
    Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
    Use a function called filterEvenNumbers to encapsulate the logic for this. The function takes in the original array
    and returns the new array.
 */

public class Solution38 {
    static final Scanner userInput = new Scanner(System.in);

    private String promptInput(){
        System.out.println("Enter a list of numbers, separated by spaces:");

        return userInput.nextLine();
    }

    private String[] splitString(String inputString){
        return inputString.split(" ");
    }

    public int[] filterEvenNumbers(String[] inputStringSplit){
        int[] evenNumbersOnly = new int[inputStringSplit.length];
        int arrayIndex = 0;

        //For each item in the array:
            //If the number modulo 2 is 0, print it
            //If NFE, print error message and exit the program
        for(String value : inputStringSplit){
            try{
                if(Integer.parseInt(value) % 2 == 0){
                    evenNumbersOnly[arrayIndex] = Integer.parseInt(value);
                    arrayIndex++;
                }
            }catch(NumberFormatException nfe){
                System.out.println("You didn't read the instructions.");
                System.exit(1);
            }
        }

        return evenNumbersOnly;
    }

    private void printEvenNumbers(int[] evenNumbersOnly){
        System.out.print("The even numbers are");

        for(int number : evenNumbersOnly){
            if(number != 0) {
                System.out.printf(" %d", number);
            }
        }

        System.out.print(".");
    }

    public static void main(String[] args) {
        Solution38 solutionApp = new Solution38();

        //Prompt the user for a string
        String inputString = solutionApp.promptInput();

        //Create an array by splitting the string at each space
        String[] inputStringSplit = solutionApp.splitString(inputString);

        //Filter out the even numbers and return them as a new array
        int[] evenNumbersOnly = solutionApp.filterEvenNumbers(inputStringSplit);

        //Print the new array of even numbers only
        solutionApp.printEvenNumbers(evenNumbersOnly);
    }
}
