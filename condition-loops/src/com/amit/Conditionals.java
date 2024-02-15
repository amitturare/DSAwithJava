package com.amit;

public class Conditionals {
    public static void main(String[] args) {
        // Conditions
        /*
            Syntax for if statements:
            if (boolean expression) {
                // body
            } else {
                // body
            }
        */
        int salary = 25400;
//        if (salary > 10000) {
//            salary += 2000;
//        } else {
//            salary += 1000;
//        }

        // Multiple if-else statements
        if (salary > 20000) {
            salary += 2000;
        } else if (salary > 10000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}