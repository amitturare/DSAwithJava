package com.amit;

import java.util.Scanner;

public class QCountOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Q: Find the number of times a number is occurring
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int number = num;
        System.out.print("Enter the number to check: ");
        int n = in.nextInt();

        // n % 10 = last digit of n
        // n / 10 = Removes the last digit of n
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == n) {
                count++;
            }
            num = num / 10;
        }

        System.out.println("Number of " + n + "s" + " in " + number + " is " + count);
    }
}
