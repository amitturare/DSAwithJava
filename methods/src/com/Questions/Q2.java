package com.Questions;

import java.util.Scanner;

public class Q2 { // Define a program to find out whether a given number is even or odd.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter some number: ");
        int a = in.nextInt();

        String result = OddorEven(a);
        System.out.println(a + " is an " + result + " number.");

    }

    static String OddorEven(int a) {
        if (a % 2 == 0) {
            return "even";
        }
        else {
            return "odd";
        }
    }

}
