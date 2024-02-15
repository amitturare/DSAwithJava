package com.amit.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 0 , 2, 1, 1, 0};

        System.out.println("Before sorting: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swapElements(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swapElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
