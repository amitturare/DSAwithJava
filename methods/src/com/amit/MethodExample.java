package com.amit;

public class MethodExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        sum(num1, num2);

        mul(num1, num2);
//      OR
        int ans = mul(10, 18);
        System.out.println(ans);
        System.out.println(mul(10, 20));
    }

    static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    static int mul(int a, int b) {
        int mul = a * b;
        return mul;
    }
}
