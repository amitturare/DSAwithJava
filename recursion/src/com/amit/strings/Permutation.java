package com.amit.strings;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        getPerms("", "abc");

        System.out.println();

        System.out.println(getPermsList("", "abc"));
    }

    static void getPerms(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String last = p.substring(i, p.length());
            getPerms(first + ch + last, up.substring(1));
        }
    }

    static int getPermsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String last = p.substring(i, p.length());
            count = count + getPermsCount(first + ch + last, up.substring(1));
        }

        return count;
    }

    static ArrayList<String> getPermsList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String last = p.substring(i, p.length());
            ans.addAll(getPermsList(first + ch + last, up.substring(1)));
        }

        return ans;
    }
}
