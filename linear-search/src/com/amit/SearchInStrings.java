package com.amit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Amit";
        char target = 'A';

        System.out.println(search2(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            char letter = str.charAt(index);
            if (letter == target) {
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char letter: str.toCharArray()) {
            if (letter == target) {
                return true;
            }
        }
        return false;
    }
}
