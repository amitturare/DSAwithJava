package com.amit;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int num = 1;
        String name = "Suni";

        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println(num);
        changeNum(num);
        System.out.println(num);

        System.out.println(name);
        changeStr(name);
        System.out.println(name);

    }
    /*
            Strings are immutable in Java
            Arrays are mutable in Java
    */
    static void change(int[] arr) {
        arr[0] = 100;
    }

    static void changeNum(int num) {
        num = 5;
    }

    static void changeStr(String str) {
        str = "Amit";
    }

}
