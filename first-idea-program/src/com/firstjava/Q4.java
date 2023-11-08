package com.firstjava;

import java.util.Scanner;

public class Q4 { // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = input.nextDouble();
        System.out.print("Enter the second number: ");
        double b = input.nextDouble();
        System.out.print("What operand you wanna use? ");
        char sign = input.next().charAt(0);

        if (sign == '+') {
            System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
        }
        else if (sign == '-') {
            System.out.println("Addition of "+b+" from "+a+" is: "+(b-a));
        }
        else if (sign == '*') {
            System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
        }
        else if (sign == '/') {
            System.out.println("Division of "+a+" by "+b+" is: "+(a/b));
        }
    }
}
