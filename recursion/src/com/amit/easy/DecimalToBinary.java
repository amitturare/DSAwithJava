package com.amit.easy;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(d2B(255));
    }

    static int d2B(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + 10 * d2B(n/2);
    }
}
