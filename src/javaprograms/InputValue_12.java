package javaprograms;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class InputValue_12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //prompt user for input
        System.out.println("Enter a character:");
        String input = scanner.nextLine();

        // directly calling static method into main method
        checkValue(input);

        //close scanner
        scanner.close();
    }
// create static method
    public static void checkValue(String input) {
        char ch = 0;
        if (input.length() == 1) {  // check if the input is a single character
            ch = input.charAt(0);
        }
        if (Character.isDigit(ch)) {
            System.out.println("The input is a number.");
        } else if (Character.isLetter(ch)) {
            System.out.println("The input is an alphabet.");
        } else {
            System.out.println("The input is a symbol.");
        }
    }
}
