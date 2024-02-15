package com.amit;

import java.util.Scanner;

public class QFibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Q: Find the nth fibonacci number
        // Fibonacci Series = 0, 1, 1, 2, 3, 5, 8, 13, ...
        // Example, give 6th fibo num = 8, give 7th fibo num = 13

        int a = 0;
        int b = 1;
        System.out.println("Enter the index of the fibo series: ");
        int n = in.nextInt();

        for (int i = 2; i <= n; i++) {
            int temp = a;
            a = b;
            b += temp;
        }
        System.out.println("nth Fibonacci Number = " + b);
    }
}
