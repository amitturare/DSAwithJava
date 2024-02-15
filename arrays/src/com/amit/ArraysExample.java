package com.amit;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arr = new int[3];
        float[] strArr = new float[3];

        int[][] twoArr = new int[2][];
        twoArr[0][99] = 4;

        int[] arr1 = {1, 2, 3, 4, 6};

        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(arr1));
    }
}
