/*
    Write a program to print the sum of negative numbers,
    sum of positive even numbers and the sum of positive odd numbers
    from a list of numbers (N) entered by the user.
    The list terminates when the user enters a zero.
*/

package assignment_01;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int negativeSum = 0;
        int evenSum = 0;
        int oddSum = 0;

        int num = in.nextInt();

        while (num != 0) {
            if (num < 0) {
                negativeSum += num;
            } else {
                if (num % 2 == 0) {
                    evenSum += num;
                } else {
                    oddSum += num;
                }
            }
            num = in.nextInt();
        }

        System.out.println("Negative sum = " + negativeSum);
        System.out.println("Even sum = " + evenSum);
        System.out.println("Odd sum = " + oddSum);
    }
}
