package com.amit;

public class QMaximumIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        System.out.println("Maximum number: " + max(arr));
    }

    static int max(int[][] arr) {
        int max = 0;
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col] > max) {
//                    max = arr[row][col];
//                }
//            }
//        }

        // Using enhanced for loop
        for (int[] rArr: arr) {
            for (int element: rArr) {
                if (element > max) {
                    max = element;
                }
            }
        }

        return max;
    }
}
