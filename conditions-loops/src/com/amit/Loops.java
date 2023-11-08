package com.amit;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
            Syntax of for loops:
            for (initialisation; condition; increment/decrement) {
                // body
            }

         */

        // Q: Print numbers from 1 to 5
//        for (int i = 1; i <= 5; i +=1) {
//            System.out.println(i);
//        }

        // Q: Print numbers from 1 to n
//        System.out.print("Enter some number: ");
//        int n = input.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
//        }

        /*
            Syntax of while loop:
            while (condition) {
                //body
            }
         */

        // Q: Print numbers from 1 to 5 using while loop
//        int num = 1;
//
//        while (num <= 5) {
//            System.out.print(num + " ");
//            num += 1;
//        }

        /*
            Syntax of do-while loop:
            do {
                // body
            } while (condition)
         */

        int n = 1;
        do {
            System.out.print(n + " ");
            n++;
        } while (n <= 5);












    }
}
