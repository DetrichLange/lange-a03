/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.Random;
import java.util.Scanner;

/*
Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again
later."
    The value should be chosen randomly using a pseudo random number generator. Store the possible choices in a list
    and select one at random.
 */

public class Solution33 {
    Scanner userInput = new Scanner(System.in);
    Random rng = new Random();

    private void promptQuestion(){
        System.out.println("What's your question?");
        userInput.nextLine();
    }

    private int pickRandomNumber(int upperBound){
        return rng.nextInt(upperBound);
    }

    public String getAnswer(String[] possibleAnswers, int randomNumber){
        return possibleAnswers[randomNumber];
    }

    public static void main(String[] args) {
        Solution33 solutionApp = new Solution33();

        //Create an array with the potential answers
        String[] possibleAnswers = new String[]{"Yes.", "No.", "Maybe.", "Ask again later."};

        //Call a method that prompts the user for a question and reads it, returns void
        solutionApp.promptQuestion();

        //Call a method using the length of the answer array as a parameter. The method picks a random number.
        int randomNumber = solutionApp.pickRandomNumber(possibleAnswers.length);

        //Call a method using the array of answers and the random number as parameters.
        //The method returns the string indexed at the chosen number.
        String chosenAnswer = solutionApp.getAnswer(possibleAnswers, randomNumber);

        //Print the returned string.
        System.out.println(chosenAnswer);
    }
}
