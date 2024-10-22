package javaprograms;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */
import java.util.Scanner;

public class OddEven_6 {
    public static void main(String[] args) {
        //declare sccaner
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Determine if the number is odd or even
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        // Close the scanner
        scanner.close();
    }
}
