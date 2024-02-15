// Question: #268, https://leetcode.com/problems/missing-number/

package com.amit.questions;

public class QMissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};

        System.out.println("Missing number: " + missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swapElements(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // Search for first missing number,
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j]) {
                return j;
            }
        }
        return arr.length;
    }

    static void swapElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
