package com.amit;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {18, 12, -7, 3, 14, 28};
        System.out.println(min(nums));
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
