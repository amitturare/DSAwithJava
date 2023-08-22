package com.amit;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        greet();

        System.out.print("Enter your name: ");
        String name = in.next().trim();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static void greet() {
        System.out.println("Hello World!");
    }
}
