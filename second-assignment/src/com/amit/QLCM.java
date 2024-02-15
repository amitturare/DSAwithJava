package com.amit;

import java.util.Scanner;

public class QLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // HCF * LCM = a * b

        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        int hcf = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        int lcm = (a * b) / hcf;

        System.out.println("LCM of " + a + " and " + b + ": " + lcm);
    }
}
