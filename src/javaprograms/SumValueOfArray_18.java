package javaprograms;

import java.util.Arrays;

/**
 * Write a Java program to sum values of an array.
 */

public class SumValueOfArray_18 {

    public static void main(String[] args) {

        // declare, initialize an integer array
        int a [] = {5, 10, 15, 20, 25};

        // calculate sum of array value
        System.out.print("The Sum value of array is: ");
        System.out.println(Arrays.stream(a).sum()); // sum value of array

    }
}
