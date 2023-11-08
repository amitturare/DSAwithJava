package com.Questions;

import java.util.Scanner;
import java.lang.Math;

public class Q6 { // Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = in.nextDouble();

        Area(radius);
        Circumference(radius);
    }

    static void Area(double r) {
        double a = 3.14 * r * r;
        System.out.println("The area of the circle having " + r + " is " + a);
    }

    static void Circumference(double r) {
        double c = 2 * 3.14 * r;
        System.out.println("The area of the circle having " + r + " is " + c);
    }
}
