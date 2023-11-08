package com.Questions;

import java.awt.*;
import java.util.Scanner;

public class Q14 { // Sum Of A Digits Of Number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int temp = num;
        int sum = 0;

        while (num>0) {
            int reminder = num % 10;
            sum += reminder;

            num /= 10;
        }
        System.out.println("Sum of a digits of a number" + temp + " is " + sum);
    }
}
