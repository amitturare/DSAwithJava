package com.amit;

import java.util.Scanner;

public class QProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        System.out.println("Product of " + a + " and " + b + " is: " + multiplication(a, b));
    }

    static int multiplication(int a, int b) {
        return  a * b;
    }
}
