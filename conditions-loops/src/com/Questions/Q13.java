package com.Questions;

import java.util.Scanner;

public class Q13 { // LCM of two numbers
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the first number: ");
        int b = in.nextInt();
        int hcf = 0;
        int lcm = 0;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        lcm = (a * b)/(hcf);
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }
}
