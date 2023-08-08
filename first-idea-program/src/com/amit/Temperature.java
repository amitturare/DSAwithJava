package com.amit;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in C = ");
        float tempInC = input.nextFloat();
        float tempInF = (tempInC * 9/5) + 32;
        System.out.println("Temperature in F = " + tempInF);
    }
}
