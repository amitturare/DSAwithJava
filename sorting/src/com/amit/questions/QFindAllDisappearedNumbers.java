// Question: #448, https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

package com.amit.questions;

import java.util.ArrayList;

public class QFindAllDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println("Missing number: " + findDisappearedNumbers(arr));
    }

    static ArrayList<Integer> findDisappearedNumbers(int[] arr) {
        // Sort the array
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swapElements(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // Search for the missing elements
        ArrayList<Integer> result = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            int value = j + 1;
            if (arr[j] != value) {
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
