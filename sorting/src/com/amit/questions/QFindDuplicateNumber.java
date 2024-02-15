// Question: #287, https://leetcode.com/problems/find-the-duplicate-number/

package com.amit.questions;

public class QFindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 1};

        System.out.println("Duplicate number: " + findDuplicateNumber(arr));
    }

//    static int findDuplicateNumber(int[] arr) {
//        int i = 0;
//        while (i < arr.length) {
//            int correctIndex = arr[i] - 1;
//            if (arr[i] != arr[correctIndex]) {
//                swapElements(arr, i, correctIndex);
//            } else {
//                i++;
//            }
//        }
//
//        // Search for the duplicate number
//        for (int index = 0; index < arr.length; index++) {
//            int value = index + 1;
//            if (arr[index] != index + 1) {
//                return arr[index];
//            }
//        }
//        return -1;
////        return arr[arr.length-1]; // Works for specific scenarios
//    }

    // OR

    static int findDuplicateNumber(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] != i + 1) {
                    int correctIndex = arr[i] - 1;
                    if (arr[i] != arr[correctIndex]) {
                        swapElements(arr, i, correctIndex);
                    } else {
                        return arr[i];
                    }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swapElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
