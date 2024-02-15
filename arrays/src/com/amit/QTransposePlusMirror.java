package com.amit;

import java.util.Arrays;

public class QTransposePlusMirror {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        int[][] result = transpose(arr);
        int[][] rotateMatrix = swapArr(result);

        for(int[] rowEl: rotateMatrix) {
            System.out.println(Arrays.toString(rowEl));
        }
    }

    static int[][] transpose(int[][] arr) {
        int[][] result = new int[arr.length][arr[0].length];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                result[row][col] = arr[col][row];
            }
        }
        return result;
    }

    static int[][] swapArr(int[][] arr) {
        int[][] result = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][arr[i].length - 1 - j];
            }
        }
        return result;
    }

    /*
        static returnType functionName(args...) {
            // body
            return (...) == returnType
        }

        type[] arrName = new type[lengthOfArr];
        // Step 1: declaration
        type[] arrName;
        // Step 2: initialization
        arrName = new type[lengthOfTheArr];

        type[]
    */
}
