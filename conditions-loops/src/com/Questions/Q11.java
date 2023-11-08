package com.Questions;

import java.util.Scanner;
import java.lang.Math;

public class Q11 { // Armstrong Number In Java
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int temp = num;
        int arm = 0;

        while (num > 0) {
            int reminder = num % 10;
            num /= 10;
            arm += Math.pow(reminder, 3);
        }
        if (temp == arm) {
            System.out.println(temp + " is a armstrong number.");
        }
        else {
            System.out.println(temp + " is not a armstrong number.");
        }
    }
}
