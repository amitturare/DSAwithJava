package com.firstjava;

import java.util.Scanner;

public class Q6 { // Input currency in rupees and output in USD.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount in INR: ");
        float inr = input.nextFloat();

        System.out.println("USD: " + inr*73);

    }
}
