package com.amit;

import java.util.Scanner;

public class QLargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int largest = 0;
        while (true) {
            int n = in.nextInt();

            if (n > largest) {
                largest = n;
            } else if (n == 0) {
                break;
            }
        }

        System.out.println(largest);
    }
}
