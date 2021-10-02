/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Write a program that prompts for response times from a website in milliseconds. It should keep asking for values until
the user enters “done.” The program should print the average time (mean), the minimum time, the maximum time, and the
population standard deviation.
    Create functions called average, max, min, and std, which take in a list of numbers and return the results.
    Use loops and arrays to perform the input and mathematical operations.
    Be sure to exclude the "done" entry from the inputs.
    Be sure to properly ignore any invalid inputs.
    Keep the input separate from the processing and the output.
 */

public class Solution36 {
    static final Scanner userInput = new Scanner(System.in);

    public double promptNumber(){

    }

    public double average(ArrayList<Double> numberList){

    }

    public double max(ArrayList<Double> numberList){

    }

    public double min(ArrayList<Double> numberList){

    }

    public double std(ArrayList<Double> numberList){

    }

    public static void main(String[] args) {
        Solution36 solutionApp = new Solution36();

        //Make an arraylist for the numbers

        //In a loop:
            //Prompt user to enter a number
            //If the inputted string equals "done", return -1 and break loop
            //Try to parse the inputted string as a double
                //Catch NFE, print error message
            //If the double is < 0:
                //print error message
            //Else:
                //return the double, add it to the list

        //Calculate average:
            //Add all numbers in the list together, divide by the size of the list

        //Calculate minimum:
            //Copy first number in arraylist to new variable smallestNumber.
            //For each number in the list:
                //Compare it to smallestNumber. If it's smaller than smallestNumber, set smallestNumber to equal it.
            //Return smallestNumber.

        //Calculate maximum:
            //Copy first number in arraylist to new variable biggestNumber.
            //For each number in the list:
                //Compare it to biggestNumber. If it's bigger than biggestNumber, set biggestNumber to equal it.
            //Return biggestNumber.

        //Calculate standard deviation:
            //Sum together all the numbers in the arraylist.
            //Take the sum - the average.
            //Raise that to the power of 2.
            //Divide that by the size of the arraylist.
            //Return the square root of that. sqrt((sum - average)^2 / size)

        //Print out the contents of the list
        //Print the average, minimum, maximum, and standard deviation.
    }
}
