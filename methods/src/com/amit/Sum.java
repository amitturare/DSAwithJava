package com.amit;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        sum();

//        int ans = sum2(); // sum2() is returning a value to ans
//        System.out.println(ans);

        int ans = sum3(20, 30);
        System.out.println(ans);
    }

    /*
        access modifier (OOPs concept) returnType name (parameters) {
            // body
            return statement;
        }
    */
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // Function with return value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        int sum = a + b;
        return sum; // Return ends the function
    }

    // Function with parameters
    static int sum3(int num1, int num2) {
        int sum = num1 + num2;
        return sum; // Return ends the function
    }
}
