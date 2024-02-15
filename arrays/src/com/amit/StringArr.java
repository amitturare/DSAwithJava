package com.amit;

import java.util.Arrays;
import java.util.Scanner;

public class StringArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of objects
        String[] str = new String[4]; // By default, it will have 4 null objects.
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // Modify the arr
        str[2] = "Amit";
        System.out.println(Arrays.toString(str));
    }
}
