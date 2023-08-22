package com.amit;

import java.util.Scanner;

public class QPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inputStr = in.next().trim();
        String reverseStr = reverseString(inputStr);

//        for (int i = 0; i < inputStr.length(); i++) {
//            char letter = inputStr.charAt(i);
//            reverseStr = letter + reverseStr;
//          System.out.println(reverseStr);
//        }

        if (inputStr.equalsIgnoreCase(reverseStr)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }


    }

    static String reverseString(String inputStr) {
        String reverseStr = "";
        for (int i = 0; i <= inputStr.length() - 1; i++) {
            char letter = inputStr.charAt(i);
            reverseStr = letter + reverseStr;
        }
        return reverseStr;
    }
}

