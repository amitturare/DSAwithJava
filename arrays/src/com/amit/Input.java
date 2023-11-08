package com.amit;

import javax.swing.text.html.CSS;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        // [23, 45, 233, 543, 3]
//        System.out.println(arr[3]);

//        // input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        // To print the elements of the array
//        for (int num : arr) { // For every element in array, print the element
//            System.out.print(num + " "); // Here `num` represents the element of the array
//        }

        // Izi method to print the array
//        System.out.println(Arrays.toString(arr));

        // Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // Modify
        str[1] = "Amit";
        System.out.println(Arrays.toString(str));
    }
}
