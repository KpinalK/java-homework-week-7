package javaprograms;

import java.util.Arrays;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class AverageValueOfArray_19 {

    public static void main(String[] args) {

        // declare, initialize an integer array
        int a [] = {5, 10, 15, 20, 25};

        // calculate average of array value
        System.out.print("The average value of array is: ");
        System.out.println(Arrays.stream(a).average());

    }
}
