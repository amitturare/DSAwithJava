package com.Questions;

import java.util.Scanner;

public class Q2 { // Calculate Electricity Bill
    public static <string> void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
            Less than or equal to 100 units, the cost is 3.45,
            101 - 300 units, the cost is 7.30
            301 - 500 units, the cost is 9.90
            > 500, the cost is 11.5
            If industry, cost is 7.4
            If commercial, cost is 11.7
         */




        while (true) {

            // Take the number of units as input
            System.out.print("Tell the type of the place: ");
            char place = in.next().trim().charAt(0);
            System.out.print("Number of units consumed: ");
            int units = in.nextInt();
            float price = 0;

            if (place == 'R' || place == 'I' || place == 'C' || place == 'r' || place == 'i' || place == 'c') {
                if (place == 'R' || place == 'r') {
                    if (units <= 100) {
                        price = units * 3.45f;
                    }
                    if (units > 100 && units<=300) {
                        price = units * 7.30f;
                    }
                    if (units>300 && units<=500) {
                        price = units * 11.5f;
                    }
                }
                if (place == 'I' || place == 'i') {
                    price = units * 7.4f;
                }
                if (place == 'C' || place == 'c') {
                    price = units * 11.7f;
                }
                System.out.println("Cost of units " + units + " in the type of building " + place + " is " + price);
            }
            else if (place == 'X' || place == 'x') {
                System.out.println("Over");
                break;
            }
        }
    }
}
