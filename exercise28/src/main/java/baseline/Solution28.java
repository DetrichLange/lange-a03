/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.Scanner;

/*
Write a program that prompts the user for five numbers and computes the total of the numbers.
    The prompting must use repetition, such as a counted loop, not three separate prompts.
 */

public class Solution28 {
    static final Scanner userInput = new Scanner(System.in);

    private int promptNumber(){
        //Prompt user for number
        //Try to return inputted value parsed as integer, catch NFE
            //If NFE, prompt again
        while(true) {
            System.out.printf("Enter a number:%n");
            try {
                return Integer.parseInt(userInput.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.printf("Please enter a number only.%n");
            }
        }
    }

    private void printOutput(int numberTotal){
        System.out.printf("The total is %d.", numberTotal);
    }

    public int numberAdder(int[] userNumbers){
        int numberTotal = 0;

        for(int eachNumber: userNumbers){
            numberTotal += eachNumber;
        }

        return numberTotal;
    }

    public static void main(String[] args) {
        Solution28 solutionApp = new Solution28();

        int[] userNumbers = new int[5];

        for(int i=0;i<5;i++){
            userNumbers[i] = solutionApp.promptNumber();
        }

        int numberTotal = solutionApp.numberAdder(userNumbers);

        //Print output statement with numberTotal
        solutionApp.printOutput(numberTotal);
    }
}
