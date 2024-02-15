package com.amit;

import java.util.Scanner;

public class QSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        System.out.println("Sum of " + a + " and " + b + " is: " + sum(a, b));
    }

    static int sum(int a, int b) {
        return  a + b;
    }
}
