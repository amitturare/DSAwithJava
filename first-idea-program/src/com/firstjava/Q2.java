package com.firstjava;

import java.util.Scanner;

public class Q2 { // Take name as input and print a greeting message for that name.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.println("Good Morning! " + name + " how u doing!?");
    }

}
