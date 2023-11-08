package com.Questions;

import java.util.Scanner;

public class Q10 { // Find if a number is palindrome or not
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int temp = num;
        int reversed = 0;

        while (num > 0) {
            int reminder = num % 10;
            num /= 10;

            reversed = (reversed * 10) + reminder;
        }

        if (temp == reversed) {
            System.out.println(temp + " is a palindrome number.");
        }
        else {
            System.out.println(temp + " is not a palindrome number.");
        }
    }
}
