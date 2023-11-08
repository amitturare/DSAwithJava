package com.Questions;

import java.util.Scanner;

public class Q9 { // Sum Of N Numbers
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int sum = 0;

        while (num >= 0) {
            sum += num;
            num -= 1;
        }
        System.out.println("Sum: " + sum);
    }
}
