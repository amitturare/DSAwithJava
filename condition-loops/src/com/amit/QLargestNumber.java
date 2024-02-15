package com.amit;

import java.util.Scanner;

public class QLargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int a = in.nextInt();
        System.out.print("Enter second number = ");
        int b = in.nextInt();
        System.out.print("Enter third number = ");
        int c = in.nextInt();

        // Q: Find the largest of the 3 numbers
//        int largest = a;
//        if (b > largest) {
//            largest = b;
//        } if (c > largest) {
//            largest = c;
//        }

        // ELSE
        int largest = Math.max(Math.max(a, b), c);

        System.out.println("Largest Number = " + largest);
    }
}
