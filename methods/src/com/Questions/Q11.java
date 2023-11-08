package com.Questions;

import java.util.Scanner;

public class Q11 { // Write a function that returns the sum of first n natural numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter some number: ");
        int n = in.nextInt();

        int result = Sum(n);
        System.out.println("Sum for first " + n + " natural numbers is " + result);

    }

    static int Sum(int a) {
        int result = 0;

        while (a > 0) {
            result += a;
            a --;
        }
        return result;
    }
}
