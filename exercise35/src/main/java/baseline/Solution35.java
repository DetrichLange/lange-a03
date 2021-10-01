/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.*;

/*
Create a program that picks a winner for a contest or prize drawing. Prompt for names of contestants until the user
leaves the entry blank. Then randomly select a winner.
    Use a loop to capture user input into an array.
    Use a random number generator to pluck a value from the array.
    Don’t include a blank entry in the array.
    Some languages require that you define the length of the array ahead of time. You may need to find another data
    structure, like an ArrayList.
 */
public class Solution35 {
    static final Scanner userInput = new Scanner(System.in);
    static final Random rng = new Random();

    private String promptName(){
        System.out.println("Enter a name:");
        return userInput.nextLine();
    }

    private int getRandomIndex(int arrayLength){
        return rng.nextInt(arrayLength);
    }

    public String getWinner(List<String> listOfNames, int randomIndex){
        return listOfNames.get(randomIndex);
    }

    private void printWinner(String winnerName){
        System.out.printf("The winner is... %s.", winnerName);
    }

    public static void main(String[] args) {
        Solution35 solutionApp = new Solution35();

        //Create an arraylist
        ArrayList<String> listOfNames = new ArrayList<>();

        String addName;
        //In a loop:
        while(true){
            //Prompt the user to enter a name.
            addName = solutionApp.promptName();

            //If the entered line is blank:
            //break the loop.
            if(addName.equals("")){
                break;
            }

            //Else:
            //Add the entered string to the arraylist
            else{
                listOfNames.add(addName);
            }
        }

        //Create a random number between 0 and the array size
        int randomIndex = solutionApp.getRandomIndex(listOfNames.size());

        //Get the name located at the random index
        String winnerName = solutionApp.getWinner(listOfNames, randomIndex);

        //Print a statement with the element of the arraylist at the index of the random number
        solutionApp.printWinner(winnerName);
    }
}
