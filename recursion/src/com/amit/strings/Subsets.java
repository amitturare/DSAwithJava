package com.amit.strings;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        getSubsets("", "abc");

        System.out.println();

        ArrayList<String> ansList = new ArrayList<>();
        getSubsets("", "abc", ansList);
        System.out.println(ansList);

        System.out.println(getSubsets1("", "abc"));
    }

    static void getSubsets(String p, String up) { /* p: processed str; up: unprocessed str */
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);
        getSubsets(p + ch, up.substring(1));
        getSubsets(p, up.substring(1));
    }

    static void getSubsets(String p, String up, ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return;
        }

        char ch = up.charAt(0);
        getSubsets(p + ch, up.substring(1), list);
        getSubsets(p, up.substring(1), list);
    }

    static ArrayList<String> getSubsets1(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = getSubsets1(p + ch, up.substring(1));
        ArrayList<String> right = getSubsets1(p, up.substring(1));

        // Join both the arrays having results
        left.addAll(right);
        return left;
    }
}
