package com.amit;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Write a number to reverse: ");
        int num_to_reverse = in.nextInt();
        int temp = num_to_reverse;
        int reversed_number = 0;

        while (num_to_reverse != 0) {
            int rem = num_to_reverse % 10;
            num_to_reverse /= 10;

            reversed_number = 10 * reversed_number + rem;
        }
        System.out.println("After reversing: " + reversed_number);
    }
}
