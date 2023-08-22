package com.amit;

import java.util.Scanner;

public class QSimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the operator: ");
        char operator = in.next().trim().charAt(0);

        System.out.print("Enter first number: ");
        float num1 = in.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = in.nextFloat();

        float result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 + num2;
            } else {
                System.out.println("Second number entered is 0.");
            }
        } else if (operator == '%') {
            result = num1 % num2;
        } else {
            System.out.println("Enter a valid operator!");
        }

        if (result % 1 == 0) {
            System.out.println("Result: " + (int)result);
        } else {
            System.out.println("Result: " + result);
        }
    }
}
