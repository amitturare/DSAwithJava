package com.Questions;

import java.util.Scanner;

public class Q3 { // Calculate Average Of N Numbers
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        float n = in.nextFloat();
        float temp = n;
        float sum = 0;
        int count = 0;

        while (n > 0) {
            sum = (sum + n);
            n -= 1;
            count += 1;
        }
        float avg = sum/count;
        System.out.println(count + " and " + sum);
        System.out.println("Average of " + temp + " numbers is " + avg);
    }
}
