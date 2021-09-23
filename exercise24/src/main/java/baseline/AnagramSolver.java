package baseline;

import java.util.Arrays;

public class AnagramSolver{

    //AnagramSolver has two values, string1 and string2.

    public AnagramSolver(String string1, String string2){
        //Constructor takes two strings as arguments and sets them to string1 and string2.
    }

    void solveAnagram(){
        //Use isEqualLength to check if the strings are equal length.
            //If false, use exitNotAnagrams.

        //Use stringToArray twice to convert each strings to a character array and return them.
        //Use characterArraySort twice to sort each character array and return them sorted.
        //Use checkArraysEqual to compare both arrays and return if first equals second (true/false).
            //If false, use exitNotAnagrams.
            //Else, use exitYesAnagrams.
    }

    boolean isEqualLength(String string1, String string2){
        //Check if the strings are equal length, return true/false.
    }

    void exitNotAnagrams(String string1, String string2){
        //Print that the strings are not anagrams and exit the program.
    }

    void exitYesAnagrams(String string1, String string2){
        //Print that the strings are anagrams and exit the program.
    }

    char[] stringToArray(String userstring){
        //Convert string to character array and return the array.
    }

    char[] characterArraySort(char[] convertedstring){
        //Sort a character array and return the sorted array.
    }

    boolean checkArraysEqual(char[] sortedstring1, char[] sortedstring2) {
        //Return whether the first sorted array equals the second (true/false).
    }
}
