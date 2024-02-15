package com.amit;

import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        System.out.println(sortString("amiit"));
    }

    static String sortString(String str) {
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        char[] noDuplicatesArr = removeDuplicatesInSortedArr(charArr);

        return new String(noDuplicatesArr);
    }


    static char[] removeDuplicatesInSortedArr(char[] arr) {
        char[] result = new char[arr.length];

        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[0]);
            if (arr[i] == arr[i - 1]) {
                break;
            } else {
                result[index++] = arr[i];
            }
        }

        return result;
    }
}
