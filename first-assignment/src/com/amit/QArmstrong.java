package com.amit;

import java.util.Scanner;

public class QArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        Number = 153
        It will be armstrong only when
        1^(num of digits) + 5^(3) + 3^(3)
        1 + 125 + 27 = 153
        */

        int num = in.nextInt();
        int numCopy = num;
        int totalDigits = Integer.toString(num).length();

        int sum = 0;
        for (int i = 0; i < totalDigits; i++) {
            int digit = num % 10;
            sum += Math.pow(digit, totalDigits);
            num /= 10;
        }

        System.out.println(num);
        if (num == sum) {
            System.out.println(numCopy + " is an armstrong number.");
        } else {
            System.out.println(numCopy + " is not an armstrong number.");
        }
    }
}
