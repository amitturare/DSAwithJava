package com.amit;

import java.util.Arrays;

public class ChangeValueWithFuncExample {
    public static void main(String[] args) {
        // Create an array
        int[] arr = {1, 2, 3, 4, 5, 6};

        change(arr);
        System.out.println(Arrays.toString(arr));

        int num = 10;
        changeNum(num);
        System.out.println(num);
    }

    static void changeNum(int number) {
        number = 69; // creates a new object
    }
    static void change(int[] nums) {
        nums[0] = 99; // if you make a change to the object via this ref variable, same object will be changed
    }
}
