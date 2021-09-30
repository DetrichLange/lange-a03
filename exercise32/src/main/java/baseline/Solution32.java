/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;

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

    public static void main(String[] args) {
        //print "Let's play Guess the Number!"
        
        //in a loop:
            //Call a function that:
                //in a (second) loop:
                    //prompts player for difficulty level
                    //tries to parse that value as an int
                        //If NFE, prints error message (must enter an int 1, 2, or 3) and restart loop
                    //checks if the value is between 1 and 3 inclusive
                        //If it is, returns the entered difficulty level
                    //prints error message

            //Call a function using difficulty level as parameter that:
                //if difficulty is 1, sets random target between 1 and 10 inclusive
                //if difficulty is 2, sets random target between 1 and 100 inclusive
                //if difficulty is 3, sets random target between 1 and 1000 inclusive
                //returns the random target

            //Call a function using random target as parameter that:
            //sets an integer numberOfGuesses and a String responseMessage
                //in a (second) loop:
                    //calls a helper method that:
                        //if numberOfGuesses is zero, prints "I have a number. What's your guess?"
                            //else, prints responseMessage + "Guess again:"
                        //tries to parse the entered value as a number
                            //if NFE, set responseMessage to "Not a number."
                        //returns the number
                    //sets responseMessage using a helper method using target number and entered number as parameter that:
                        //compares entered value to target number
                            //if too high, return "Too high."
                            //if too low, return "Too low."
                            //if equal, return "equal"
                    //if returned "equal", call a helper method using numberOfGuesses as parameter that:
                        //prints "You got it in (numberOfGuesses) guesses!/n/nDo you wish to play again (Y/N)?"
                            //if entered string is Y, return true
                            //else, exit program
                    //if returned true, break loop
                    //end/restart (second) loop
    }
}
