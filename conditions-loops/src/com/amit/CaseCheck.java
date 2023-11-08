package com.amit;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any char: ");
        char ch = in.next().trim().charAt(0);
//        System.out.print(ch);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case");
        } else{
            System.out.println("Upper case");
        }

    }
}
