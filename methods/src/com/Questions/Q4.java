package com.Questions;

import java.util.Scanner;

public class Q4 { // Write a program to print the sum of two numbers entered by user by defining your own method.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        
        Sum(a, b);
    }

    private static void Sum(int a, int b) {
        float sum = a + b;
        System.out.println("The sum = " + sum);
    }
}
