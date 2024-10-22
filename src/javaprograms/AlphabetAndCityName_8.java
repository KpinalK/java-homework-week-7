package javaprograms;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 */

public class AlphabetAndCityName_8 {

    public static void main(String[] args) {
        //declare scanner
        Scanner scanner = new Scanner(System.in);

        // prompt user for enter input
        System.out.println("Enter an alphabet (A-F): ");
        char input = scanner.next().charAt(0);

        //directly calling myCityName method into main method
        String cityName = myCityName(input);
        System.out.println(cityName);// print the city name

        //close scanner
        scanner.close();
    }
// create method
    public static String myCityName(char letter){
        if (letter == 'A'){
            return "City: Abbeystead";
        }else if (letter == 'B'){
            return "city: Bradford";
        }else if (letter == 'C'){
            return "City: Coventry";
        }else if (letter == 'D'){
            return "City: Derby";
        }else if (letter == 'E'){
            return "City: Edinburgh";
        }else if (letter == 'F'){
            return "City: Florence";
        }else{
            return "Invalid entry.";
        }
    }
}
