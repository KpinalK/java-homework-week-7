package javaprograms;

import java.util.Scanner;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class ArraySpecificValue_20 {

    public static void main(String[] args) {
        // Initialize an integer array
        int[] numbers = {5, 10, 15, 20, 25};

        // Prompt the user for a value to search for
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
        int valueToFind = scanner.nextInt();

        // Check if the array contains the specified value
        boolean contains = containsValue(numbers, valueToFind);

        // Print the result
        if (contains) {
            System.out.println("The array contains the value " + valueToFind + ".");
        } else {
            System.out.println("The array does not contain the value " + valueToFind + ".");
        }
        // Close the scanner
        scanner.close();
    }

    // Method to check if the array contains a specific value
    public static boolean containsValue(int[] array, int value) {
        for (int number : array) {
            if (number == value) {
                return true; // Value found
            }
        }
        return false; // Value not found
    }
}
