package com.amit;

import java.util.Scanner;

public class QFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int product = 1;
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        System.out.println("Factorial of " + num + " is " + product);
    }
}
