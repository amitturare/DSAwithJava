// Question: #442, https://leetcode.com/problems/find-all-duplicates-in-an-array/

package com.amit.questions;

import java.util.ArrayList;

public class QFindAllDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println("Duplicate numbers: " + findAllDuplicateNumber(arr));
    }

    static ArrayList<Integer> findAllDuplicateNumber(int[] arr) {
        int i = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swapElements(arr, i , correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            int value = index + 1;
            if (arr[index] != value) {
                result.add(arr[index]);
            }
        }
        return result;
    }

    static void swapElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
