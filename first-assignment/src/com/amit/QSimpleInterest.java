package com.amit;

import java.util.Scanner;

public class QSimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter principle amount: ");
        float p = in.nextFloat();
        System.out.print("Enter time: ");
        float t = in.nextFloat();
        System.out.print("Enter rate of interest: ");
        float r = in.nextFloat();

        float simpleInterest = (p * t * r) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}
