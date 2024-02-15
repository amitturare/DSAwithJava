package com.amit;

import java.util.Scanner;

public class QSumOfAllInputNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers: ");

        int sum = 0;
        while (true) {
            int num = in.nextInt();
            sum += num;

            if (num == 0) {
                break;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
