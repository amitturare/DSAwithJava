/*
    Question:
    Input Str: baccad
    Output Str: bccd

    Approach
    1. Take str as argument, which can be passed to future calls.
    2. Create the ans variable in the function body.

    Now first iterate through the str and check if it is equal to 'a'.
    If it is not equal to 'a', then add it to the ans variable.
    If it is equal to 'a', then just skip it.
*/

package com.amit.strings;

public class StringQ {
    public static void main(String[] args) {
//        skip("", "baccadah");

//        System.out.println(skip("baca"));

        System.out.println(skipApple("asdsappleb"));

        System.out.println(skipAppNotApple("asappffappleh"));
    }

    static void skip(String p, String up) { /* p: processed str; up: unprocessed str */
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skip(String up) { /* up: unprocessed str */
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
