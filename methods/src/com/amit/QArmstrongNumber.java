package com.amit;

import java.util.Scanner;

public class QArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Q: Check for armstrong numbers
//        System.out.print("Enter a number: ");
//        int num = in.nextInt();
//        System.out.println(isArmstrong(num));

        // Q: Print all three digit the armstrong numbers
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int num) {
        int original = num;

        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            sum = (int)(sum + Math.pow(rem, 3));
        }
        return sum == original;
    }
}
