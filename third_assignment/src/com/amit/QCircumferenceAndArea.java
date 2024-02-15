package com.amit;

import java.util.Scanner;

public class QCircumferenceAndArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = in.nextFloat();

        System.out.println("For radius: " + radius +
                ", circumference: " + circumference(radius) +
                ", area: " + area(radius));
    }

    static double circumference(double r) {
        return ((double)(22/7) * 2 * r);
    }

    static double area(double r) {
        return ((double)(22/7) * Math.pow(r, 2));
    }
}
