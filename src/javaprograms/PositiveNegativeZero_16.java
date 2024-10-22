package javaprograms;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
 */

public class PositiveNegativeZero_16 {

    public static void main(String[] args) {
        //declare scanner
        Scanner scanner = new Scanner(System.in);

        // prompt user fo input
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();

        // directly calling static method into main method
        enterNumber(number);

        //close scanner
        scanner.close();
    }

       // create static method
    public static void enterNumber(double number) {
        if (number > 0) {
            System.out.println("The number is POSITIVE.");
        } else if (number < 0) {
            System.out.println("The number is NEGATIVE.");
        } else {
            System.out.println("The number is ZERO.");
        }
    }
}
