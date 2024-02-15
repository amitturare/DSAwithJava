package com.amit;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {15, 19, 18, 22, 10, 20, 2, 45};
        int target = 99;

        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    /*
        Search in the array. If item found, return its index, else
        return -1.
    */
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            // Check for element at every index if it is equal to target
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }

    // Search for the target and return true or false
    static boolean linearSearch2(int[] arr, int target) {
        for (int num: arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // Search for the target and return the element
    static int linearSearch3(int[] arr, int target) {
        for (int num: arr) {
            if (num == target) {
                return num;
            }
        }
        return Integer.MAX_VALUE; // Because -1 may be the element of the arr
    }
}