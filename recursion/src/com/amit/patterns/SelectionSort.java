package com.amit.patterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 8, 1};
        sort(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int row, int col, int maxIndex) {
        if (row == 0) {
            return;
        }
        if (col <= row) {
            if (arr[col] > arr[maxIndex]) {
                sort(arr, row, col + 1, col);
            } else {
                sort(arr, row, col + 1, maxIndex);
            }
            // From the above all elements will be checked,
            // and we will get the maxElement
        } else {
            // Now swap with the last index (row - 1)
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[row];
            arr[row] = temp;

            // Move to the next row
            sort(arr, row - 1, 0, 0);
        }
    }
}
