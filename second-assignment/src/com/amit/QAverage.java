package com.amit;

import java.util.Scanner;

public class QAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int n = in.nextInt();

            sum += n;
            count++;

            if (n == 0) {
                break;
            }
        }

        if ((count - 1) != 0) {
            float avg = (float) sum / (float) (count - 1);
            System.out.println("Average: " + avg);
        } else {
            System.out.println("Count of numbers is 0, not possible to take average.");
        }
    }
}
