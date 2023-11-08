package com.amit;

import java.util.Arrays;

public class Overloading { // Functions having same names
    public static void main(String[] args) {
//        fun(67);
//        fun("Amit");

//        int ans = sum(1, 2);
//        System.out.println(ans);
//        ans = sum(2, 3, 4);
//        System.out.println(ans);

        demo(1, 2, 3);
        demo("Amit", "Arun");


    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }

}
