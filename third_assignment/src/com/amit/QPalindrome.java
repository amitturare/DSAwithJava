/*
    Write a function to find if a number is a
    palindrome or not. Take number as parameter.
*/

package com.amit;

import java.util.Scanner;

public class QPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int reversedNum = reverse(num);

        if (num == reversedNum) {
            System.out.println("It is a palindrome number");
        } else {
             System.out.println("It is not a palindrome number");
        }
    }

    static int reverse(int num) {
        int result = 0;
        while (num > 0) {
            int digit = num % 10;
            result = (result * 10) + digit;
            num /= 10;
        }
        return result;
    }
}
