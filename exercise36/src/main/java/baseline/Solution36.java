/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Write a program that prompts for response times from a website in milliseconds. It should keep asking for values until
the user enters "done." The program should print the average time (mean), the minimum time, the maximum time, and the
population standard deviation.
    Create functions called average, max, min, and std, which take in a list of numbers and return the results.
    Use loops and arrays to perform the input and mathematical operations.
    Be sure to exclude the "done" entry from the inputs.
    Be sure to properly ignore any invalid inputs.
    Keep the input separate from the processing and the output.
 */

public class Solution36 {
    static final Scanner userInput = new Scanner(System.in);

    private double promptNumber(){
        String nextNumber;
        double nextNumberDouble = 0;

        //Prompt user to enter a number
        System.out.println("Enter a number:");
        nextNumber = userInput.nextLine();

        //If the inputted string equals "done", return -1 and break loop
        if(nextNumber.equals("done")){
            return -1;
        }

        //Try to parse the inputted string as a double
        try{
            nextNumberDouble = Double.parseDouble(nextNumber);

        }
        //Catch NFE, print error message
        catch(NumberFormatException nfe){
            System.out.println("Please enter a number or \"done\".");
        }

        //If the double is > 0:
        //return the double, add it to the list
        if(nextNumberDouble > 0){
            return nextNumberDouble;
        }
        //Else:
        //print error message
        else{
            System.out.println("Please enter a positive number.");
        }
        return -2;
    }

    public double average(List<Double> numberList){
        double numberAverage = 0;

        //Add all numbers in the list together
        for(double number : numberList){
            numberAverage += number;
        }

        //divide by the size of the list
        return numberAverage / numberList.size();
    }

    public double max(List<Double> numberList){
        //Copy first number in arraylist to new variable biggestNumber.
        double biggestNumber = numberList.get(0);

        //For each number in the list:
        for(double number : numberList){
            //Compare it to biggestNumber. If it's bigger than biggestNumber, set biggestNumber to equal it.
            if(number > biggestNumber){
                biggestNumber = number;
            }
        }

        //Return biggestNumber.
        return biggestNumber;
    }

    public double min(List<Double> numberList){
        //Copy first number in arraylist to new variable smallestNumber.
        double smallestNumber = numberList.get(0);

        //For each number in the list:
        for(double number : numberList){
            //Compare it to smallestNumber. If it's smaller than smallestNumber, set smallestNumber to equal it.
            if(number < smallestNumber){
                smallestNumber = number;
            }
        }

        //Return smallestNumber.
        return smallestNumber;
    }

    public double std(List<Double> numberList, double numberAverage){
        double numberStandardDeviation = 0;

        //For each number in the arraylist, take the value - the average raised to the power of 2 and sum the result.
        for(double number : numberList){
            numberStandardDeviation += Math.pow((number - numberAverage), 2);
        }

        //Divide that by the size of the arraylist.
        numberStandardDeviation = numberStandardDeviation / numberList.size();

        //Return the square root of that. sqrt((sum - average)^2 / size)
        return Math.sqrt(numberStandardDeviation);
    }

    private void printNumberList(ArrayList<Double> numberList){
        System.out.println("Numbers: ");
        for(int i=0;i<numberList.size();i++){
            if(i>0){
                System.out.print(", ");
            }
            System.out.printf("%.0f", numberList.get(i));
        }
        System.out.println("");
    }

    private void printStats(double numberAverage, double numberMinimum, double numberMaximum,
                            double numberStandardDeviation){
        System.out.printf("The average is %.1f" +
                "%nThe minimum is %.0f" +
                "%nThe maximum is %.0f" +
                "%nThe standard deviation is %.2f%n",
                numberAverage, numberMinimum, numberMaximum, numberStandardDeviation);
    }

    public static void main(String[] args) {
        Solution36 solutionApp = new Solution36();

        //Make an arraylist for the numbers
        ArrayList<Double> listOfNumbers = new ArrayList<>();

        double nextNumber;
        //In a loop:
        while(true){
            //Prompt user to enter a number
            nextNumber = solutionApp.promptNumber();

            //If the inputted string equals "done", return -1 and break loop
            if(nextNumber == -1){
                break;
            }

            //return the double, add it to the list
            else if(nextNumber > 0){
                listOfNumbers.add(nextNumber);
            }
        }

        //Calculate average:
        double numberAverage = solutionApp.average(listOfNumbers);

        //Calculate minimum:
        double numberMinimum = solutionApp.min(listOfNumbers);

        //Calculate maximum:
        double numberMaximum = solutionApp.max(listOfNumbers);

        //Calculate standard deviation:
        double numberStandardDeviation = solutionApp.std(listOfNumbers, numberAverage);

        //Print out the contents of the list
        solutionApp.printNumberList(listOfNumbers);

        //Print the average, minimum, maximum, and standard deviation.
        solutionApp.printStats(numberAverage, numberMinimum, numberMaximum, numberStandardDeviation);
    }
}
