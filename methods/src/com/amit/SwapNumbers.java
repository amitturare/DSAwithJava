package com.amit;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Swap Numbers
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Amit";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "Rahul Rana"; // creating a new object, it doesn't modify the 'name'
    }

    static void swap (int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        // This change will only be valid in this function scope only.
    }
}
