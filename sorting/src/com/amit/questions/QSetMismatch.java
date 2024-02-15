// Question: #645, https://leetcode.com/problems/set-mismatch/

package com.amit.questions;

import java.util.ArrayList;

public class QSetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};

        System.out.println("Error numbers: " + findErrorNums(nums));
    }

    static ArrayList<Integer> findErrorNums(int[] arr) {
        int i = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swapElements(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            int value = index + 1;
            if (arr[index] != value) {
                result.add(arr[index]);
                result.add(value);
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
