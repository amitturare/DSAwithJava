/*
    Define two methods to print the maximum and the minimum
    number respectively among three numbers entered by the user.
*/

package com.amit;

import java.util.Scanner;

public class QMinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        System.out.print("Enter the third number: ");
        int c = in.nextInt();

        System.out.println("Maximum Value: " + maximum(a, b, c));
        System.out.println("Minimum Value: " + minimum(a, b, c));
    }

    static int maximum(int a, int b, int c) {
        int maxValue = a;
        if (b > maxValue) {
            maxValue = b;
        } if (c > maxValue) {
            maxValue = c;
        }

        return maxValue;
    }

    static int minimum(int a, int b, int c) {
        int minValue = a;
        if (b < minValue) {
            minValue = b;
        } if (c < minValue) {
            minValue = c;
        }

        return minValue;
    }
}