package com.amit;

import java.util.Scanner;

public class QReverseNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        // n % 10 = last digit of n
        // n / 10 = Removes the last digit of n
        int result = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            result = (result * 10) + lastDigit;
            num /= 10;
        }

        System.out.println("Reversed number: " + result);
    }
}
