package javaprograms;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class WeekDays_13 {

    public static void main(String[] args) {

        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        // prompt user to enter input
        System.out.println("Enter a number (1 to 7) to get the corresponding day of the week: ");
        int dayNumber = scanner.nextInt();

        // direct calling static method into main method
          week(dayNumber);

          // close scanner
        scanner.close();
    }

    //create static method
    public static void week(int dayNumber){
        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }

    }
}
