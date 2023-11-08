package com.amit;

import java.util.Arrays;

public class Invert {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0};

        System.out.println(Arrays.toString(invert(arr)));
    }

    static int[] invert(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i ++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return arr;
    }
}
