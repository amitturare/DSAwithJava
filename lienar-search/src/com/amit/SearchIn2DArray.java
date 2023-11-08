package com.amit;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr =
                {{23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}};

        int target = 56;
        int[] ans = search(arr, target); // format of return value {row, column}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));

    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }

        }
        return max;

    }

    static int[] search(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{-1, -1};
        }
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if (target == arr[rows][cols]) {
                    return new int[]{rows, cols};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
