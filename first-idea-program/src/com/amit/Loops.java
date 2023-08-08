package com.amit;

public class Loops {
    public static void main(String[] args) {
//        If statement
//        int a = 10;
//        if (a == 10) {
//            System.out.println("Hello World");
//        }

        // while loop, should be used when you don't know how many times the loop is going to run
        int count = 1;
        while (count != 5) {
            System.out.println(count);
            count++;
        }

        // for loop, should be used when you know how many times the loop is going to run
        for (int i = 1; i != 5; i++) {
            System.out.println(i);
        }
    }
}
