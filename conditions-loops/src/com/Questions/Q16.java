package com.Questions;

import java.util.Scanner;

public class Q16 {
    /*
        Write a program to print the sum of negative numbers,
        sum of positive even numbers and the sum of positive odd numbers
        from a list of numbers (N) entered by the user.
        The list terminates when the user enters a zero.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nSum = 0;
        int eSum = 0;
        int oSum = 0;
        System.out.println("Enter random numbers: ");
        while (true) {

            int num = in.nextInt();

            if (num == 0) {
                System.out.println("Over!");
                break;
            }
            if (num < 0) {
                nSum += num;
            }
            else if (num % 2 == 0) {
                eSum += num;
            }
            else {
                oSum += num;
            }
        }

        System.out.println("Sum of negative integers: " + nSum);
        System.out.println("Sum of even integers: " + eSum);
        System.out.println("Sum of odd integers: " + oSum);
    }
}
