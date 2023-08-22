package com.amit;

import java.util.Scanner;

public class QGreeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Good Morning, " + name);
    }
}
