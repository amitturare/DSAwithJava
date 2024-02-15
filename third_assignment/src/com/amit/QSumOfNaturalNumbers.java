package com.amit;

import java.util.Scanner;

public class QSumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println("Sum of first " + n + " natural numbers is: " + sum(n));
    }

    static int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
