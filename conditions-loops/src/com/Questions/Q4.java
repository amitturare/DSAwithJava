package com.Questions;

import java.util.Scanner;
import java.lang.Math;

public class Q4 { // Calculate Distance Between Two Points
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of the x coordinate of the first point: ");
        float x1 = in.nextFloat();
        System.out.print("Enter the value of the y coordinate of the first point: ");
        float y1 = in.nextFloat();
        System.out.print("Enter the value of the x coordinate of the second point: ");
        float x2 = in.nextFloat();
        System.out.print("Enter the value of the y coordinate of the second point: ");
        float y2 = in.nextFloat();

        double dist = Math.sqrt( Math.pow( (x2 - x1), 2 ) + Math.pow((y2-y1), 2));
        System.out.println("Distance between " + "("+x1+","+y1+")" + " and " + "("+x2+","+y2+") is " + dist);
    }
}
