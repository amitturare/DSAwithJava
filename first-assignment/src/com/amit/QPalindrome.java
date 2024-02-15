package com.amit;

import java.util.Scanner;

public class QPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inputStr = in.next().trim();
        String reversedStr = reverseString(inputStr);
        System.out.println(reversedStr);

//        for (int i = 0; i < inputStr.length(); i++) {
//            char letter = inputStr.charAt(i);
//            reverseStr = letter + reverseStr;
//          System.out.println(reverseStr);
//        }

        if (inputStr.equalsIgnoreCase(reversedStr)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }


    }

    static String reverseString(String in) {
        StringBuilder reversedStr = new StringBuilder();

        for (int i = 0; i < in.length(); i++) {
            char ch = in.charAt(in.length() - i - 1);
            reversedStr.append(ch);
        }

        return reversedStr.toString();
    }
}

