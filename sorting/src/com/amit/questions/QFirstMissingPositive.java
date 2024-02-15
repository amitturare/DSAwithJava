package com.amit.questions;

public class QFirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {-1, 1, 3, 4};

        System.out.println("First missing positive number: " + firstMissingPositive(nums));
    }

    static int firstMissingPositive(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swapElements(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            int value = index + 1;
            if (arr[index] != value) {
                return value;
            }
        }
        return arr.length + 1;
    }

    static void swapElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
