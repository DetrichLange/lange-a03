/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.Arrays;
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
        System.out.printf("Enter two strings and I'll tell you if they are anagrams:%n");
    }

    String promptString(String whichString){
        System.out.printf("Enter the %s string:%n", whichString);
        return userInput.nextLine();
    }

    char[] convertStringToArray(String userString){
        return userString.toCharArray();
    }

    public boolean isAnagram(String word1, String word2){
        //isAnagram calls convertStringToArray to convert into char array
        char[] converted1 = convertStringToArray(word1);
        char[] converted2 = convertStringToArray(word2);

        //isAnagram sorts both arrays
        Arrays.sort(converted1);
        Arrays.sort(converted2);

        return (Arrays.equals(converted1, converted2));
    }

    public static void main(String[] args){
        //Create application object to call methods
        Solution24 solutionApp = new Solution24();

        //Call introduction() to print explanation of what the program does
        solutionApp.introduction();

        //Set String word1 by calling promptString("first") and word2 by calling promptString("second")
        String word1 = solutionApp.promptString("first");
        String word2 = solutionApp.promptString("second");

        //Call isAnagram(word1, word2)
            //If returned true, output statement saying that the words are anagrams
            //Else, output statement saying the words are not anagrams
        if(solutionApp.isAnagram(word1, word2)){
            System.out.printf("\"%s\" and \"%s\" are anagrams.%n", word1, word2);
        }
        else{
            System.out.printf("\"%s\" and \"%s\" are not anagrams.%n", word1, word2);
        }
    }

}
