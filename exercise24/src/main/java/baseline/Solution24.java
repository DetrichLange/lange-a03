/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.Scanner;

/*
Create a program that compares two strings and determines if the two strings are anagrams. The program should prompt
for both input strings and display the output as shown in the example that follows.
    Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false. Invoke this function from your main program.
    Check that both words are the same length.
 */

public class Solution24 {
    static final Scanner userInput = new Scanner(System.in);

    void introduction(){
    }

    String promptString(String whichString){
    }

    public static void main(String[] args){
        //Create application object to call methods
        //Call introduction() to print explanation of what the program does
        //Set String word1 by calling promptString("first") and word2 by calling promptString("second")
        //Create a new anagramSolver object for the solution
        //Call isAnagram(word1, word2)
            //isAnagram calls convertStringToArray to convert into char array
            //isAnagram calls sortArray with converted char array
            //isAnagram compares both sorted arrays and returns true if they are equal
                //If returned true, output statement saying that the words are anagrams
                //Else, output statement saying the words are not anagrams
    }

}
