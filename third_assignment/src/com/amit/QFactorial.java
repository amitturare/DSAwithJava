/*
    Write a program to print the factorial of a
    number by defining a method named 'Factorial'.
*/

package com.amit;

import java.util.Scanner;

public class QFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.println(num + "! = " + factorial(num));
    }

    static int factorial(int num) {
        int ans = 1;

        for (int i = 1; i <= num; i++) {
            ans *= i;
        }
        return ans;
    }
}
