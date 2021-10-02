/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Detrich Lange
 */

package baseline;
import java.util.*;

/*
Create a program that generates a secure password. Prompt the user for the minimum length, the number of special
characters, and the number of numbers. Then generate a password for the user using those inputs.
    Use lists to store the characters you’ll use to generate the passwords.
    Ensure that the generated password is random.
    Ensure that there are at least as many letters are there are special characters and number.
 */

public class Solution37 {
    static final Scanner userInput = new Scanner(System.in);
    Random rng = new Random();

    private int promptInt(String promptMessage){
        while(true) {
            System.out.println(promptMessage);
            try {
                return Integer.parseInt(userInput.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter an integer only.");
            }
        }
    }

    public List<Character> generatePassword(int minimumLength, int numberOfSpecialChars, int numberOfNumbers){
        List<Character> passwordList = new ArrayList<>();

        //Loop a number of times equal to numberOfSpecialChars:
            //Generate a special character and add it to the password list
        for(int i=0;i<numberOfSpecialChars;i++){
            passwordList.add(generateSpecial());
        }

        //Loop a number of times equal to numberOfNumbers:
            //Generate a number and add it to the password list
        for(int i=0;i<numberOfNumbers;i++){
            passwordList.add(generateNumber());
        }

        //Figure out which is greater, numberOfNumbers + numberOfSpecialChars
        //or minimumLength - numberOfNumbers - numberOfSpecialChars
        int numberOfLetters = Math.max((minimumLength - numberOfSpecialChars - numberOfNumbers),
                (numberOfSpecialChars + numberOfNumbers));

        //Loop that many times:
            //Generate a random letter and add it to the list
        for(int i=0;i<numberOfLetters;i++){
            passwordList.add(generateLetter());
        }

        return passwordList;
    }

    private char generateLetter(){
        List<Character> listOfLetters = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

        return listOfLetters.get(rng.nextInt(52));
    }

    private char generateNumber(){
        List<Character> listOfLetters = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0');

        return listOfLetters.get(rng.nextInt(10));
    }

    private char generateSpecial(){
        List<Character> listOfLetters = Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=');

        return listOfLetters.get(rng.nextInt(14));
    }

    private void printOutput(List<Character> passwordList){
        System.out.printf("Your password is ");
        for(char passwordChar : passwordList){
            System.out.print(passwordChar);
        }

    }

    public static void main(String[] args) {
        Solution37 solutionApp = new Solution37();

        //Make an arraylist of characters to store the password
        List<Character> passwordList;

        //Prompt user for minimum length
        int minimumLength = solutionApp.promptInt("What's the minimum length?");

        //Prompt user for number of special characters
        int numberOfSpecialChars = solutionApp.promptInt("How many special characters?");

        //Prompt user for number of numbers
        int numberOfNumbers = solutionApp.promptInt("How many numbers?");

        //Generate the password
        passwordList = solutionApp.generatePassword(minimumLength, numberOfSpecialChars, numberOfNumbers);

        //Shuffle the list
        Collections.shuffle(passwordList, new Random());

        //Print the contents of the list
        solutionApp.printOutput(passwordList);

    }
}
