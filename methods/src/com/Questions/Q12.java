package com.Questions;

import java.util.Scanner;

public class Q12 { // DOUBT Write a function that returns all prime numbers between two given numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the lower bound of the interval: ");
        int a = in.nextInt();
        System.out.print("Enter the upper bound of the interval: ");
        int b = in.nextInt();

//        int result =  Pnums(a, b);
//        System.out.println("Prime numbers between " + a + " and " + b  + " are " + result);
    }

//    static int Pnums(int lower, int upper) {
//        for (int i = lower; i < upper + 1; i++) {
//            if (i > 1) {
//                for (int j = 2; j < i; j++) {
//                    if (i % j == 0) {
//                        break;
//                    }
//                }
//                return i;
//            }
//        }
//    }
}
