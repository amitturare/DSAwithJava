package com.amit;

import java.util.Scanner;
import java.lang.Math;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.print("Enter some number: ");
//        int n = in.nextInt();

//        System.out.println(isArmstrong(n));

//        for (int i = 100; i < 1000; i++) {
//            if (isArmstrong(i)) {
//                System.out.print(i + " ");
//            }
//        }



    }

    // To check if a number is armstrong or not
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, 3);

            n /= 10;
        }
        return sum == original;
    }


    // To check if a number is prime or not
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while(c * c <=n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

}
