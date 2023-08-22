package com.amit;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        /*
            Function overloading happens when
            there are two or more functions of
            same name.
            They can exist if only the parameters
            are different.

            After compilation, it decides which
            func to run based on the parameters.
        */

        func(69);
        func("Amit");

        demo(1, 2, 3, 4);
        demo("Amit", "Suni");

        int ans1 = sum(1, 2);
        int ans2 = sum(1, 2, 3);
        System.out.println(ans1);
        System.out.println(ans2);

        // If demo is called with no parameters,
//        demo(); // An ambiguity is created, this gives an error as it cannot understand which one is getting called
    }

    static void func(int a) {
        System.out.print("First ");
        System.out.println(a);
    }
    static void func(String name) {
        System.out.print("Second ");
        System.out.println(name);
    }

    static void demo(int ...variableIntegers) {
        System.out.println(Arrays.toString(variableIntegers));
    }
    static void demo(String ...variableStrings) {
        System.out.println(Arrays.toString(variableStrings));
    }

    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
