package com.amit.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};

        System.out.println("Before sorting: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxElementIndex = getMaxElementIndex(arr, 0, lastIndex);
            swapElements(arr, maxElementIndex, lastIndex);
        }
    }

    static int getMaxElementIndex(int[] arr, int start, int end) {
        int maxValueIndex = start;

        for (int i = start; i <= end; i++) {
            if (arr[i] >  arr[maxValueIndex]) {
                maxValueIndex = i;
            }
        }
        return maxValueIndex;
    }

    static void swapElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
