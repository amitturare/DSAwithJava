package com.amit;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
//        System.out.println(arr[2]); // Outputs: 3

        // Inputting using for loops,
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }

        // Print the elements of the arr1
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }

        // Print the elements of the arr1 using enhanced for loop
        for (int num: arr1) { // For every element in array, print the element
            System.out.print(num + " "); // Here num represents the element of the arr1
        }

        // Print the array using .toString() method
        System.out.println(Arrays.toString(arr1));
    }
}