/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;

/*
Create a program that generates a multiplication table for the numbers 1 through 12 (inclusive).
    Use a nested loop to complete this program.
    Align each column within the table without using the tab character.
 */

public class Solution30 {

    public StringBuilder timesTable(int tableSize){
        //Initialize StringBuilder named outputTable
        //For-loop y=0, y<tableSize, y++
            //For-loop x=0, x<tableSize, x++
                //Add x*y padded to 4 characters to outputTable
            //Add line break to outputTable
        StringBuilder outputTable = new StringBuilder();

        for(int y=1; y<=tableSize; y++){
            for(int x=1; x<=tableSize; x++){
                outputTable.append(String.format("%4d", x*y));
            }
            outputTable.append("\n");
        }

        return outputTable;
    }

    public static void main(String[] args) {
        Solution30 solutionApp = new Solution30();

        StringBuilder outputTable = solutionApp.timesTable(12);

        System.out.print(outputTable);
    }
}
