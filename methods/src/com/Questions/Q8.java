package com.Questions;

import java.util.Scanner;

public class Q8 { // Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        float marks = in.nextFloat();

        Grade(marks);
    }

    static void Grade(float marks) {
        if (marks > 91 && marks <= 100) {
            System.out.println("Grade: AA");
        }
        if (marks > 81 && marks <= 90) {
            System.out.println("Grade: AB");
        }
        if (marks > 71 && marks <= 80) {
            System.out.println("Grade: BB");
        }
        if (marks > 61 && marks <= 70) {
            System.out.println("Grade: BC");
        }
        if (marks > 51 && marks <= 60) {
            System.out.println("Grade: CD");
        }
        if (marks > 41 && marks <= 50) {
            System.out.println("Grade: DD");
        }
    }

}
