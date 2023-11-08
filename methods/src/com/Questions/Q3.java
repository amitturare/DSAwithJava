package com.Questions;

import java.util.Scanner;

public class Q3 { // A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        checkAge(age);
    }

    static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        }
        else {
            System.out.println("You are not eligible to vote!");
        }
    }
}
