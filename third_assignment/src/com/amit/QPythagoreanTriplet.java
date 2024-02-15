package com.amit;

import java.util.Scanner;

public class QPythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.print("Enter third number: ");
        int c = in.nextInt();

        if (isTriplet(a, b, c)) {
            System.out.println("It is an Pythagorean triplet.");
        } else {
            System.out.println("It is not an Pythagorean triplet.");
        }
    }

    static int largest(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    static boolean isTriplet(int a, int b, int c) {
        int largestVal = largest(a, b, c);
        if (largestVal == a && Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
            return true;
        } else if (largestVal == b && Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
            return true;
        }  else if (largestVal == c && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            return true;
        }

        return false;
    }
}
