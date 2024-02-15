package com.amit;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
            Syntax of for loop:
            for (initialization; condition; increment/decrement) {
                // body
            }

            Should be used when you know how
            many times the loop is going to run.
        */
        // Q: Print numbers from 1 to 5
//        for (int count = 1; count <= 5; count++) {
//            System.out.println(count);
//        }

        // Q: Print numbers from 1 to n
//        System.out.print("Enter some number: ");
//        int n = in.nextInt();
//        for (int num = 1; num <= n; num++) {
//            System.out.print(num + " ");
//        }

        /*
            Syntax of while loop:
            while (condition) {
                // body
            }

            Should be used when you don't know how
            many times the loop is going to run.
        */
        // Q: Print numbers from 1 to 5
//        int num = 1;
//        while (num <= 5) {
//            System.out.print(num + " ");
//            num++;
//        }

        /*
            Syntax of do-while loop:
            do {
                // body
            } while (condition);

            In this the loop is going to execute
            at least once
        */
        int n = 6;
        do {
            System.out.print(n + " ");
            n++;
        } while (n <= 5); // This condition is not satisfied but still it ran once

        // Now similarly with the while loop,
        while (n <= 5) {
            System.out.println(n + " ");
            n++;
        }
        // This loop will not run even once and outputs nothing!
    }
}
