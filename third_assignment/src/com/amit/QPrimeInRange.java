package com.amit;

import java.util.Scanner;

public class QPrimeInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        getPrimeNumbers(a, b);
    }

    static void getPrimeNumbers(int a, int b) {
        if (a == 1) {
            a = 2;
        }

        for (int i = a; i <= b; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
