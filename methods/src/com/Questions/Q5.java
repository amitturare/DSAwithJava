package com.Questions;

import java.util.Scanner;

public class Q5 { // Define a method that returns the product of two numbers entered by user.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        Mutiply(a, b);
    }

    static void Mutiply(int a, int b) {
        float multiply = a * b;
        System.out.println("Result: " + multiply);
    }
}
