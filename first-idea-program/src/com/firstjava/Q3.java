package com.firstjava;

import java.util.Scanner;

public class Q3 { // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal value: ");
        float p = input.nextFloat();
        System.out.print("Enter the time (in years): ");
        float t = input.nextFloat();
        System.out.print("Enter the rate: ");
        float r = input.nextFloat();

        System.out.println("Simple Interest: " + (p * r * t)/100);
    }
}
