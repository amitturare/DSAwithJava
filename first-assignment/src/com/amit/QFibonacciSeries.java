package com.amit;

import java.util.Scanner;

public class QFibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();
        // 0, 1, 1, 2, 3, 5, 8, 13, ...
        int a = 0;
        int b = 1;

        for (int count = 0; count <= n; count ++) {
            System.out.print(a + " ");

            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
