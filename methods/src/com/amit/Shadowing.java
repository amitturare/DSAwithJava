package com.amit;

public class Shadowing {
    static int x = 69; // This will also have its own scope. Every block below can access this!
    // Above variable will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 40; // The class variable at line 4 is shadowed by this
        /*
            Shadowing in Java is a concept of using
            two variables with same names within the scope
            that overlaps.
            This effect doesn't work on methods
        */
        System.out.println(x); // 40

        random();
    }

    static void random() {
        System.out.println(x); // No Error
    }
}
