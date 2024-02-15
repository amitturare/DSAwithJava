package com.amit;

import java.util.Scanner;

public class QExponent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.print("Enter a power: ");
        int power = in.nextInt();

        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= num;
        }
        System.out.println(num + "^" + power + " = " + result);
    }
}
