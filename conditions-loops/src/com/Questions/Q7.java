package com.Questions;

import java.util.Scanner;
import java.lang.Math;

public class Q7 { // Compound Interest Java Program
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    /*
        Compound Interest formula: A = P(1 + R/100)^n
     */

        System.out.print("Enter principal: ");
        double p = in.nextDouble();
        System.out.print("Enter rate: ");
        double r = in.nextDouble();
        System.out.print("Number of years: ");
        double n = in.nextDouble();

        double a = Math.pow( p*(1 + r/100), n);

        System.out.println("Compound Interest: " + (a-p));
    }
}
