package com.amit;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            An array of arrays,
            [[1 2 3], // 0th index
            [4 5 6],  // 1st index
            [7 8 9]]  // 2nd index

            Individual size of the array can vary itself, therefore,
            it is not mandatory to specify the columns.
        */

        // Method 1
//        int[][] arr = new int[3][]; // rows, columns (not necessary to specify)

        // Method 2
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9}
//        };

        int[][] arr = new int[3][3];
//        System.out.println(arr.length); // Outputs the number of rows, 3

        // Inputting values in 2D array
        // Method 1
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // Outputting a 2D array
        // Method 1
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println(); // This will add a new line after every row
//        }

        // Method 2 - Using enhanced for loop
//        for (int[] rowEl: arr) {
//            for (int colEl: rowEl) {
//                System.out.print(colEl + " ");
//            }
//            System.out.println();
//        }

        // Method 3 - Using .toString() method
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // Method 4 - Using .toString() method and enhanced for loop
        for (int[] rowEl: arr) {
            System.out.println(Arrays.toString(rowEl));
        }
    }
}
