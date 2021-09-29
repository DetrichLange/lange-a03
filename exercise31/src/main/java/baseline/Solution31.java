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
    static final Scanner userInput = new Scanner(System.in);
    static final String ERRORMESSAGE = "Please enter a number.";

    //Set minIntensity to 55, maxIntensity to 95, incrementIntensity to 5
    static int minIntensity = 55;
    static int maxIntensity = 95;
    static int incrementIntensity = 5;

    private double promptValue(String whichNumber){
        //While true:
            //Prompt user for specified value
            //Try to return entered line as int, then break
                //Catch NFE, print error message and continue loop
        while(true){
            System.out.printf("Please enter %s:%n", whichNumber);
            try{
                return Double.parseDouble(userInput.nextLine());
            }catch(NumberFormatException nfe){
                System.out.println(ERRORMESSAGE);
            }
        }
    }

    public StringBuilder buildHeartRateTable(double userAge, double userRestingHeartRate){
        //Create StringBuilder named outputTable
        StringBuilder outputTable = new StringBuilder();

        //Append header line
        outputTable.append("Intensity   | Rate\n");

        //Append divider line
        outputTable.append("------------|--------\n");

        //Loop for i=minIntensity, i<=maxIntensity, i+=incrementIntensity
            //Append intensity padded to 13 chars, divider, target heart rate, bpm
        for(double i=minIntensity; i<=maxIntensity; i+=incrementIntensity){
            outputTable.append(String.format("%.0f%%", i));
            outputTable.append(" ".repeat(Math.max(0, 13 - String.valueOf(i).length())));
            outputTable.append(String.format("| %.0f bpm", (((220-userAge)-userRestingHeartRate)*(i/100)) + userRestingHeartRate));
            outputTable.append("\n");
        }

        return outputTable;
    }

    public static void main(String[] args) {
        Solution31 solutionApp = new Solution31();

        //Prompt user for age and resting heart rate
        double userAge = solutionApp.promptValue("your age");
        double userRestingHeartRate = solutionApp.promptValue("your resting heart rate");

        StringBuilder outputTable = solutionApp.buildHeartRateTable(userAge, userRestingHeartRate);

        //Print outputTable
        System.out.print(outputTable);
    }
}
