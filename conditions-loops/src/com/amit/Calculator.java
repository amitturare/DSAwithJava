package com.amit;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Q: take input from user till user doesn't press x

        while (true) {
            // Now take the operator as input
            System.out.print("Enter the operand: ");
            char operator = in.next().trim().charAt(0);
            System.out.println();

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                // Take 2 numbers as input
                System.out.print("Enter the first number: ");
                double a = in.nextDouble();
                System.out.print("Enter the second number: ");
                double b = in.nextDouble();
                System.out.println();

                if (operator == '+') {
                    System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
                }
                else if (operator == '-') {
                    System.out.println("Subtraction of " + a + " from " + b + " is " + (b - a));
                }
                else if (operator == '*') {
                    System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
                }
                else if (operator == '/') {
                    if (b != 0) {
                        System.out.println("Division of " + a + " by " + b + " is " + (a / b));
                    }
                    else {
                        System.out.println("The denominator should be a natural number.");
                    }
                }
                else if (operator == '%') {
                    System.out.println("Remainder of " + a + " byz " + b + " is " + (a % b));
                }
            }
            else if (operator == 'x' || operator == 'X'){
                System.out.println("Over");
                break;
            }
            else {
                System.out.println("Invalid operation!");
            }
        }
    }
}
