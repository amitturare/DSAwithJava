package com.amit;

import java.util.Arrays;
import java.util.Scanner;

public class QTemperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many day's temperature? ");
        int numberOfDays = in.nextInt();

        // Create the array containing temperature of the days
        int[] temps = new int[numberOfDays];
        int sum = 0;

        for (int i = 0; i < numberOfDays; i++) {
            System.out.print("Day " + (i+1) + "'s high temp: ");
            int temp = in.nextInt();
            temps[i] = temp;
            sum += temp;
        }

        // Calculate average and number of days which have temp above avg
        float avg = (float) sum / temps.length;
        int count = 0;
        for (int temp: temps) {
            if (temp > avg) {
                count++;
            }
        }

        System.out.println();
        System.out.println("Average = " + avg);
        System.out.println(count + " day(s) above average");
    }
}
