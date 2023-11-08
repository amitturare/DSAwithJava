package com.Questions;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) { // Calculate Commission Percentage
        Scanner in = new Scanner(System.in);

        long amount, dep, year, temp;

        System.out.print("Enter amount: ");
        amount = in.nextLong();
        System.out.print("Enter depreciation percentage: ");
        dep = in.nextLong();
        System.out.print("Enter the number of years: ");
        year = in.nextLong();

        temp = amount;
        for (int i = 0; i < year; i++) {
            temp = ((100 - dep) * temp)/100;
        }
        System.out.println("Amount after depreciation: " + temp);
    }
}
