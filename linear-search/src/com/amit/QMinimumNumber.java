package com.amit;

public class QMinimumNumber {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};

        System.out.println("Minimum value: " + min(arr));
    }

    static int min(int[] arr) {
        int minValue = arr[0];

        for (int num: arr) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }
}
