package com.Questions;

import java.util.Scanner;

public class Q1 { // Factorial Program In Java
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Take an integer as input from user
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int temp = num;
        int fact = 1;

        if (num == 0) {
            System.out.println("Factorial of " + num + " is " + 1);
        }
        if (num == 1) {
            System.out.println("Factorial of " + num + " is " + 1);
        }
        if (num >= 2) {
            while (num > 0) {
                fact = fact * num;
                num -= 1;
            }
            System.out.println("Factorial of " + temp + " is " + fact);
        }
    }
}
