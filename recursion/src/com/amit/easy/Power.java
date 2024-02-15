package com.amit.easy;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2, 4));
    }

    static int power(int n, int x) {
        if (x < 0) {
            return -1;
        }
        if (x == 0) {
            return 1;
        }
        return n * power(n, x - 1);
    }
}
