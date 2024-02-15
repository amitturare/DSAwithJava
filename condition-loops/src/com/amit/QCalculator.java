package com.amit;

import java.util.Scanner;

public class QCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float result = 0;
        // Take input from user till user does not press X or x
        while (true) {
            // Take operator as input
            System.out.print("Enter the operator: ");
            char operator = in.next().trim().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                // Input two numbers
                System.out.print("Enter the first number: ");
                float num1 = in.nextFloat();
                System.out.print("Enter the second number: ");
                float num2 = in.nextFloat();

                if (operator == '+') {
                    result = num1 + num2;
                }
                if (operator == '-') {
                    result = num1 - num2;
                }
                if (operator == '*') {
                    result = num1 * num2;
                }
                if (operator == '/') {
                    if (num2 != 0) {
                        result = num1 / num2;
                    }
                }
                if (operator == '%') {
                    result = num1 % num2;
                }
                if (result % 1 == 0) {
                    System.out.println("Result: " + (int)(result));
                } else {
                    System.out.println("Result: " + result);
                }
            } else if (operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
        }
    }
}
