package com.amit;

import java.util.Scanner;

public class QCurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter amount in rupees: ");
        float rupees = in.nextFloat();

        float usd = rupees * 75;

        System.out.println("Rs."  + rupees + " in USD is $" + usd);
    }
}
