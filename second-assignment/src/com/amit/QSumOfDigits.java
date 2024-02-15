package com.amit;

import java.util.Scanner;

public class QSumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int numCopy = num;

        int sum = 0;
        while (num < 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum of the digits of the number " + numCopy + " is " + sum); // string
    }
}
