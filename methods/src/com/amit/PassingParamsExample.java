package com.amit;

public class PassingParamsExample {
    public static void main(String[] args) {
        String name = "Amit";

        greet(name);
    }

    static void greet(String naam) {
        System.out.println(naam);
    }
}
