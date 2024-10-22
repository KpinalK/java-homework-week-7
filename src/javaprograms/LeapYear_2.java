package javaprograms;
/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

import java.util.Scanner;

public class LeapYear_2 {

    public static void main(String[] args) {
        // scanner declaration
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        // check if the year is a leap year or not
        boolean isLeapYear = (year % 4 == 0);

        //output the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        // Close the scanner
        scanner.close();
    }
}
