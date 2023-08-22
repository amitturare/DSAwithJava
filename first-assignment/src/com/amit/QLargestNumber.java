package com.amit;

import java.util.Scanner;

public class QLargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int num1, num2;
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        int largest;
        if (num1 > num2) {
            largest = num1;
        } else {
            largest = num2;
        }
        // OR
        // int largest = Math.max(num1, num2);

        System.out.println("Largest Number: " + largest);
    }
}
