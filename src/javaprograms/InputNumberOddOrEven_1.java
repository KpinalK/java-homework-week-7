package javaprograms;
/**
 * Write a java program that tells us that Input number is odd or even?
 */

import java.util.Scanner;

public class InputNumberOddOrEven_1 {

    public static void main(String[] args) {
        // scanner declaration
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        //using the ternary operator to check if number is odd or even
        String oddEven = (number % 2 == 0) ?"The number is even." : "The number is odd.";

        System.out.println( oddEven);

        // Close the scanner
        scanner.close();


    }
}
