package com.amit;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
            1 2 3
            4 5 6
            7 8 9

            Syntax of 2D arrays:
                datatype[][] variable_name = new datatype[][]
            // OR (Directly)
                datatype[][] variable_name = {
                                            {1, 2, 3},
                                            {4, 5, 6},
                                            {7, 8, 9}
                                            }
         */

//        int[][] arr = new int[3][];

//        int[][] arr = {
//                {1, 2, 3}, // 0th Index
//                {4, 5}, // 1st Index
//                {6, 7, 8, 9} // 2nd Index -> arr[2] = [6, 7, 8, 9]
//        };

        int[][] arr = new int[3][3];
//        System.out.println(arr.length); // Gives no. of rows

        // Input
        for (int rows = 0; rows < arr.length; rows++) {
            // for each col in each row
            for (int col = 0; col < arr[rows].length; col++) {
                arr[rows][col] = in.nextInt();
            }
        }

        // Output
//        for (int rows = 0; rows < arr.length; rows++) {
//            for (int cols = 0; cols < arr[rows].length; cols++) {
//                System.out.print(arr[rows][cols] + " ");
//            }
//            System.out.println();
//        }

        for (int rows = 0; rows < arr.length; rows++) {
            System.out.println(Arrays.toString(arr[rows]));
        }
        // OR
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

    }
}
