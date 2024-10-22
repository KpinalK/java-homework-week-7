package javaprograms;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use switch statement)
 * if any other alphabet should be invalid entry
 */

public class CityNameAndSwitchStatement_9 {

    public static void main(String[] args) {
        //declare scanner
        Scanner scanner = new Scanner(System.in);

        // prompt user for enter input
        System.out.println("Enter an alphabet (A-F): ");
        char input = scanner.next().toUpperCase().charAt(0); //convert to uppercase, enter alphabet in upper case

        //directly calling myCityName method into main method
        String cityName = myCityName(input);
        System.out.println(cityName);// print the city name

        //close scanner
        scanner.close();
    }

    //create method
    public static String myCityName(char letter) {
        switch (letter) {
            case 'A':
                return "City: Abbeystead";
            case 'B':
                return "City: Bradford";
            case 'C':
                return "City: Coventry";
            case 'D':
                return "City: Derby";
            case 'E':
                return "City: Edinburgh";
            case 'F':
                return "City: Florence";
            default:
                return "Invalid entry.";
        }
    }
}
