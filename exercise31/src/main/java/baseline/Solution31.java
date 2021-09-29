/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.Scanner;

/*
Create a program that prompts for your age and your resting heart rate. Use the Karvonen formula to determine the
target heart rate based on a range of intensities from 55% to 95%. Generate a table with the results as shown in the
example output. The formula is
TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
    Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
    Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid
    inputs.
    Display the results in a tabular format.
 */

public class Solution31 {

    public static void main(String[] args) {
        //While true:
            //Prompt user for age
            //Try to return entered age as int, then break
                //Catch NFE, print error message and continue loop

        //While true:
            //Prompt user for resting heart rate
            //Try to return entered heart rate as int, then break
                //Catch NFE, print error message and continue loop

        //Create StringBuilder named outputTable
        //Append header line
        //Append divider line

        //Set minIntensity to 55, maxIntensity to 95, incrementIntensity to 5

        //Loop for i=minIntensity, i<=maxIntensity, i+=incrementIntensity
            //Append intensity padded to 13 chars, divider, target heart rate bpm

        //Print outputTable
    }
}
