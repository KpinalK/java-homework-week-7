package javaprograms;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class NumericArrayAndStringArray_17 {

    public static void main(String[] args) {

        // declare Numeric array
        int[] numericArray = {15, 23, 81, 18, 44, 66, 59};
        System.out.println("Original numeric array: " + Arrays.toString(numericArray));

        // Sorting the numeric array
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));

        // declare String array
        String[] stringArray = {"Banana", "Apple", "Orange", "Grape", "Kiwi", "Plum"};
        System.out.println("Original string array: " + Arrays.toString(stringArray));

        // Sorting the string array
        Arrays.sort(stringArray);
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));
    }
}
