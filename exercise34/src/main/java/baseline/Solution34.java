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
Create a small program that contains a list of employee names. Print out the list of names when the program runs the
first time. Prompt for an employee name and remove that specific name from the list of names. Display the remaining
employees, each on its own line.
    Use an array or list to store the names.
 */

public class Solution34 {
    static final Scanner userInput = new Scanner(System.in);

    private void printEmployees(String[] arrayOfEmployees){
        System.out.printf("There are %d employees:%n", arrayOfEmployees.length);
        for(String employees : arrayOfEmployees){
            System.out.println(employees);
        }
    }

    private String promptName(){
        System.out.println("Enter an employee name to remove:");
        return userInput.nextLine();
    }

    private boolean checkIfNameIsEmployee(String[] employeeNames, String nameToCheck){
        //Convert array to arraylist
        List<String> listOfNames = new ArrayList<>(Arrays.asList(employeeNames));

        //If arraylist of names contains entered name, return true, otherwise return false
        return (listOfNames.contains(nameToCheck));
    }

    public String[] removeNameFromArray(String[] employeeNames, String nameToRemove){
        //Create a new array with one less index
        String[] updatedArray = new String[employeeNames.length - 1];
        int newArrayIndex = 0;

        //Copy each of the names that doesn't match the name to be removed
        for (String employeeName : employeeNames) {
            if (!employeeName.equals(nameToRemove)) {
                updatedArray[newArrayIndex] = employeeName;
                newArrayIndex++;
            }
        }

        //Return the new array with the name removed
        return updatedArray;
    }

    public static void main(String[] args) {
        Solution34 solutionApp = new Solution34();

        //Create array with the five names
        String[] employeeNames = new String[]{
                "John Smith",
                "Jackie Jackson",
                "Chris Jones",
                "Amanda Cullen",
                "Jeremy Goodwin"};

        //Print the employees in the array
        solutionApp.printEmployees(employeeNames);

        //Prompt user to enter a name
        String nameToRemove = solutionApp.promptName();

        //Check if the entered name is in the array of employees
        if(solutionApp.checkIfNameIsEmployee(employeeNames, nameToRemove)){
            //If it is, print the contents of a new array with one less entry and the name removed
            solutionApp.printEmployees(solutionApp.removeNameFromArray(employeeNames, nameToRemove));
        }
        else{
            //Otherwise, print the contents of the old array unchanged
            solutionApp.printEmployees(employeeNames);
        }
    }
}
