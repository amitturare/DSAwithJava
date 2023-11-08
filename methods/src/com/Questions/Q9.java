package com.Questions;

import java.util.Scanner;

public class Q9 { // Write a function to find if a number is a palindrome or not. Take number as parameter.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter some number: ");
        int num = in.nextInt();

        isPalindrome(num);

    }

    static void isPalindrome(int num) {
        int original = num;
        int number = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;

            number = number * 10 + rem;
        }

        if (number == original) {
            System.out.println(original + " is a palindrome number.");
        }
        else {
            System.out.println(original + " is not a palindrome number.");
        }
    }
}
