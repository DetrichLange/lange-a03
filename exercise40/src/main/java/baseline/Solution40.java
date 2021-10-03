/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.*;

/*
Given the following data set create a program that lets a user locate all records that match the search string by
comparing the search string to the first or last name field.
    Store the data using a list of maps.
 */

public class Solution40 {
    static final Scanner userInput = new Scanner(System.in);
    static final String FNAME = "First Name";
    static final String LNAME = "Last Name";
    static final String POS = "Position";
    static final String SEP = "Separation Date";

    //Make the list of maps containing the employee information using the code I already wrote for 39
    public List<Map<String, String>> makeEmployeeList(){
        List<Map<String, String>> employeeList = new ArrayList<>();

        //Add a map for each employee
        Map<String,String> employee1=new HashMap<>();
        employee1.put(FNAME, "John");
        employee1.put(LNAME, "Johnson");
        employee1.put(POS, "Manager");
        employee1.put(SEP, "2016-12-31");

        Map<String,String> employee2=new HashMap<>();
        employee2.put(FNAME, "Tou");
        employee2.put(LNAME, "Xiong");
        employee2.put(POS, "Software Engineer");
        employee2.put(SEP, "2016-10-05");

        Map<String,String> employee3=new HashMap<>();
        employee3.put(FNAME, "Michaela");
        employee3.put(LNAME, "Michaelson");
        employee3.put(POS, "District Manager");
        employee3.put(SEP, "2015-12-19");

        Map<String,String> employee4=new HashMap<>();
        employee4.put(FNAME, "Jake");
        employee4.put(LNAME, "Jacobson");
        employee4.put(POS, "Programmer");
        employee4.put(SEP, "");

        Map<String,String> employee5=new HashMap<>();
        employee5.put(FNAME, "Jacquelyn");
        employee5.put(LNAME, "Jackson");
        employee5.put(POS, "DBA");
        employee5.put(SEP, "");

        Map<String,String> employee6=new HashMap<>();
        employee6.put(FNAME, "Sally");
        employee6.put(LNAME, "Webber");
        employee6.put(POS, "Web Developer");
        employee6.put(SEP, "2015-12-18");

        //Add maps to list
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);

        return employeeList;
    }

    //Prompt the user to enter a search string
    private String promptSearchString(){
        System.out.println("Enter a search string:");

        return userInput.nextLine();
    }

    //Print table header
    private void printHeader(){
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
    }

    private boolean checkEmployeeForMatch(String searchString, Map<String, String> employee){
            if(employee.get(FNAME).contains(searchString)){
                return true;
            }
            else return employee.get(LNAME).contains(searchString);
    }

    public StringBuilder searchEmployees(String searchString, List<Map<String, String>> employeeList){
        StringBuilder output = new StringBuilder();

        //For each map in the list:
            //Check if the first name contains the search string:
            //If it does, print the employee's data.
            //If it doesn't, check if the last name contains the search string:
                //If it does, append the employee's data.
        for(Map<String, String> employee : employeeList){
            if(checkEmployeeForMatch(searchString, employee)){
                output.append(employee.get(FNAME)).append(" ").append(employee.get(LNAME));
                output.append(" ".repeat(19 - employee.get(FNAME).length() - employee.get(LNAME).length()));
                output.append("| ");
                output.append(employee.get(POS));
                output.append(" ".repeat(18 - employee.get(POS).length()));
                output.append("| ");
                output.append(employee.get(SEP));
                output.append(" ".repeat(15 - employee.get(SEP).length()));
                output.append("\n");
            }
        }

        return output;
    }


    public static void main(String[] args) {
        Solution40 solutionApp = new Solution40();

        List<Map<String, String>> employeeList = solutionApp.makeEmployeeList();

        String searchString = solutionApp.promptSearchString();

        solutionApp.printHeader();

        StringBuilder outputString = solutionApp.searchEmployees(searchString, employeeList);

        System.out.print(outputString.toString());
    }
}
