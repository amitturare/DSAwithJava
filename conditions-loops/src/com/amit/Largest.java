package com.amit;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();

        // Q: Find the largest of the three numbers
//        int max = a;
//
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.print("Max number is: " + max);

        // ANOTHER METHOD:
        int max = Math.max(c, Math.max(a, b));
        System.out.print("Max number is: " + max);


    }
}
