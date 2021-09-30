/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.Random;
import java.util.Scanner;

/*
Write a Guess the Number game that has three levels of difficulty. The first level of difficulty would be a number
between 1 and 10. The second difficulty set would be between 1 and 100. The third difficulty set would be between 1 and
1000.

Prompt for the difficulty level, and then start the game. The computer picks a random number in that range and prompts
the player to guess that number. Each time the player guesses, the computer should give the player a hint as to if the
number is too high or too low. The computer should also keep track of the number of guesses. Once the player guesses
the correct number, the computer should present the number of guesses and ask if the player would like to play again.
    Don’t allow any non-numeric data entry.
    During the game, count non-numeric entries as wrong guesses.
 */

public class Solution32 {
    static final Scanner userInput = new Scanner(System.in);
    static final String ERRORMESSAGE = "You must enter 1, 2, or 3.";
    static final Random rng = new Random();

    private int promptDifficulty(){
        //in a loop:
            //prompts player for difficulty level
            //tries to parse that value as an int
                //If NFE, prints error message (must enter an int 1, 2, or 3) and restart loop
            //checks if the value is between 1 and 3 inclusive
                //If it is, returns the entered difficulty level
            //prints error message

        int difficultyLevel;

        while(true){
            System.out.println("Enter the difficulty level (1, 2, or 3):");
            try{
                difficultyLevel = Integer.parseInt(userInput.nextLine());
                if(difficultyLevel > 0 && difficultyLevel < 4){
                    return difficultyLevel;
                }
                else{
                    System.out.println(ERRORMESSAGE);
                }
            }catch(NumberFormatException nfe){
                System.out.println(ERRORMESSAGE);
            }
        }
    }

    public int randomTarget(int difficultyLevel){
        //if difficulty is 1, return random int between 1 and 10 inclusive
        if(difficultyLevel == 1){
            return rng.nextInt(11);
        }
        //if difficulty is 2, return random int between 1 and 100 inclusive
        if(difficultyLevel == 2){
            return rng.nextInt(101);
        }
        //if difficulty is 3, return random int between 1 and 1000 inclusive
        if(difficultyLevel == 3){
            return rng.nextInt(1001);
        }
        System.out.println("Invalid difficulty");
        return -1;
    }

    private void nextGuessMessage(int numberOfGuesses, String responseMessage){
        //if numberOfGuesses is zero, prints "I have my number. What's your guess?"
            //else, prints responseMessage + "Guess again:"
        if(numberOfGuesses == 0){
            System.out.println("I have my number. What's your guess?");
        }
        else{
            System.out.printf("%s Guess again:%n",responseMessage);
        }
    }

    public int promptGuess(int numberOfGuesses, String responseMessage){

        //Call a method that prints the appropriate prompt message:
        nextGuessMessage(numberOfGuesses, responseMessage);

        //tries to return the entered value as an integer
        //if NFE, return -1
        try{
            return Integer.parseInt(userInput.nextLine());
        }catch(NumberFormatException nfe){
            return -1;
        }
    }

    private boolean checkIfCorrect(int currentGuess, int targetNumber){
        return(currentGuess == targetNumber);
    }

    public String compareGuess(int currentGuess, int targetNumber){
        //compares entered value to target number
            //if too high, return "Too high."
            //if too low, return "Too low."
            //if equal, return "X" (something went wrong)
        if(currentGuess > targetNumber){
            return "Too high.";
        }
        else if(currentGuess < targetNumber){
            return "Too low.";
        }
        else{
            return "X";
        }
    }

    private boolean rightAnswer(int numberOfGuesses){
        System.out.printf("You got it in %d guesses!%n%nDo you wish to play again (Y/N)?%n", numberOfGuesses);

        return userInput.nextLine().equals("Y");
    }

    public static void main(String[] args) {
        //print "Let's play Guess the Number!"
        System.out.println("Let's play Guess the Number!");

        int difficultyLevel;
        int currentGuess;
        int numberOfGuesses = 0;
        boolean programExit = false;
        String responseMessage = "";
        Solution32 solutionApp = new Solution32();

        //in a loop:
        do {
            //Call a method that prompts difficulty:
            difficultyLevel = solutionApp.promptDifficulty();

            //Call a method that generates a random target number:
            int targetNumber = solutionApp.randomTarget(difficultyLevel);
            if (targetNumber == -1) {
                System.out.println("Invalid difficulty, exiting");
                System.exit(1);
            }

            while (true) {
                //Call a method that prompts the user for a guess and returns it:
                currentGuess = solutionApp.promptGuess(numberOfGuesses, responseMessage);
                //Set number of guesses +1
                numberOfGuesses++;

                //Call a method that checks if the guess is correct:
                if (solutionApp.checkIfCorrect(currentGuess, targetNumber)) {
                    //If it's correct, call a method to congratulate and ask if they want to play again
                    if (solutionApp.rightAnswer(numberOfGuesses)) {
                        //If they do, reset number of guesses
                        numberOfGuesses = 0;
                    } else {
                        //If they don't, exit the program
                        programExit = true;
                    }
                    //Break this loop to start a new game
                    break;
                }

                //Call a method that compares the guess to the target and determines the response message:
                responseMessage = solutionApp.compareGuess(currentGuess, targetNumber);
                //If response message returns "X", something went wrong
                if(responseMessage.equals("X")){
                    System.exit(1);
                }
            }
        } while (!programExit);
    }
}
