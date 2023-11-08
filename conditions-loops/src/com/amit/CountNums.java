package com.amit;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to check how many times it's repeated: ");
        int num_to_check = in.nextInt();
        System.out.print("In what number you want to check occurrences of " + num_to_check + "? ");
        int num = in.nextInt();
        int temp = num;
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem == num_to_check) {
                count++;
            }
            num = num / 10;
        }
        System.out.println("Occurrence of number " + num_to_check + " in " + temp + " is " + count);
    }
}
