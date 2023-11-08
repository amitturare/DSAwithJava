package com.Questions;

import java.util.Scanner;

public class Q1 { // Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter first number: ");
        int b = in.nextInt();
        System.out.print("Enter first number: ");
        int c = in.nextInt();

        int max = largest(a, b, c);
        System.out.println("Largest number is: " + max);
        int min = smallest(a, b, c);
        System.out.println("Largest number is: " + min);
    }

    static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;
    }

    static int smallest(int first, int second, int third) {
        int min = first;
        if (min > second) {
            min = second;
        }
        if (min > third) {
            min = third;
        }
        return min;
    }
}
