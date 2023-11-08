package com.Questions;

import java.util.Scanner;

public class Q17 { // Check Leap Year Or Not
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        If a year is evenly divisible by 4 means having no remainder then go to next step. If it is not divisible by 4. It is not a leap year. For example: 1997 is not a leap year.
        If a year is divisible by 4, but not by 100. For example: 2012, it is a leap year. If a year is divisible by both 4 and 100, go to next step.
        If a year is divisible by 100, but not by 400. For example: 1900, then it is not a leap year. If a year is divisible by both, then it is a leap year. So 2000 is a leap year.
         */

        int year = in.nextInt();

        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
