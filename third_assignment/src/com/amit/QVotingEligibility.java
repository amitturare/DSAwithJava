/*
    A person is eligible to vote if his/her age is greater
    than or equal to 18. Define a method to find out if
    he/she is eligible to vote.
*/

package com.amit;

import java.util.Scanner;

public class QVotingEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        System.out.println("You are " + isEligible(age) + " to vote!");
    }

    static String isEligible(int age) {
        if (age >= 18) {
            return "eligible";
        }
        return "not eligible";
    }
}
