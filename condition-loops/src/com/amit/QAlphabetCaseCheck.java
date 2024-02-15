package com.amit;

import java.util.Scanner;

public class QAlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Q: Check whether the input character is uppercase or lowercase
        char letter = in.next().trim().charAt(0);
        // trim() removes the extra spaces that are at the end of the words
        // charAt(0) takes the first letter of the string provided and converts it into a char

        if (97 <= letter && letter <= 122) {
            System.out.println(letter + " is in lowercase.");
        } else {
            System.out.println(letter + " is in UPPERcase.");
        }


    }
}
