package com.firstjava;

import java.util.Scanner;

public class Q5 { // Take 2 numbers as input and print the largest number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        }
        else {
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}
