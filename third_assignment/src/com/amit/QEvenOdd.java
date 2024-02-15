package com.amit;/*
    Define a program to find out whether a
    given number is even or odd.
*/

import java.util.Scanner;

public class QEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.println(num + " is an " + isEven(num) + " number");
    }

    static String isEven(int n) {
        if (n % 2 == 0) {
            return "even";
        }
        return "odd";
    }
}
