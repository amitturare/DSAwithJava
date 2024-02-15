/*
    Write a program that will ask the user to enter his/her
    marks (out of 100). Define a method that will display grades
    according to the marks entered as below:

      Marks         Grade
    91 - 100         AA
    81 - 90          AB
    71 - 80          BB
    61 - 70          BC
    51 - 60          CD
    41 - 50          DD
      <= 40          F
*/

package com.amit;

import java.util.Scanner;

public class QGrades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = in.nextInt();

        System.out.println("For your marks " + marks + ", the grade is " + grade(marks));
    }

    static String grade(int marks) {
        if (marks >= 91) {
            return "AA";
        } else if (marks >= 81) {
            return "AB";
        } else if (marks >= 71) {
            return "BB";
        } else if (marks >= 61) {
            return "BC";
        } else if (marks >= 51) {
            return "CD";
        } else if (marks >= 41) {
            return "DD";
        }
        return "F";
    }
}
