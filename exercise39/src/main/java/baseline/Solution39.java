/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.*;

/*
Given the following data set, create a program that sorts all employees by last name and prints them to the screen in a
tabular format.
    Store the data using a list of maps.
 */

public class Solution39 {
    static final String FNAME = "First Name";
    static final String LNAME = "Last Name";
    static final String POS = "Position";
    static final String SEP = "Separation Date";

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

    public List<Map<String, String>> sortEmployeeList(List<Map<String, String>> employeeList){
        try {
            for (int i=0; i < employeeList.size(); i++) {
                for (int j = 0; j < employeeList.size() - i -1; j++) {
                    if (employeeList.get(j).get(LNAME).compareTo(employeeList.get(j + 1).get(LNAME)) > 0) {
                        Collections.swap(employeeList, j, j + 1);
                    }
                }
            }
        }catch(IndexOutOfBoundsException ioob){
            System.out.print("Out of bounds");
        }

        return employeeList;
    }

    private void printEmployeeList(List<Map<String, String>> sortedEmployeeList){

        //Print the table header
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        //Print each map's contents alphabetically by last name
        for (Map<String, String> stringStringMap : sortedEmployeeList) {
            System.out.printf("%s %s", stringStringMap.get(FNAME), stringStringMap.get(LNAME));
            System.out.print(" ".repeat(19 - stringStringMap.get(FNAME).length() - stringStringMap.get(LNAME).length()));
            System.out.printf("| %s", stringStringMap.get(POS));
            System.out.print(" ".repeat(18 - stringStringMap.get(POS).length()));
            System.out.printf("| %s", stringStringMap.get(SEP));
            System.out.print(" ".repeat(15 - stringStringMap.get(SEP).length()));
            System.out.printf("%n");
        }
    }

    public static void main(String[] args) {
        Solution39 solutionApp = new Solution39();

        //Create a list of maps
        List<Map<String, String>> employeeList = solutionApp.makeEmployeeList();

        //Sort the list alphabetically
        List<Map<String, String>> sortedEmployeeList = solutionApp.sortEmployeeList(employeeList);

        //Print the table
        solutionApp.printEmployeeList(sortedEmployeeList);
    }
}
