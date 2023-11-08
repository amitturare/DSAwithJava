package com.Questions;

import java.util.Scanner;

public class Q10 { // Write a program to print the factorial of a number by defining a method named 'Factorial'.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Emter some number: ");
        int num = in.nextInt();

        int result = Factorial(num);
        System.out.print("Factorial of " + num + " is " + result);
    }

    static int Factorial(int num) {
        int result = 1;

        if (num == 0) {
            return 1;
        }
        if (num == 1) {
            return 1;
        }
        while(num >= 2) {
            result *= num;
            num --;
        }
        return result;
    }
}
