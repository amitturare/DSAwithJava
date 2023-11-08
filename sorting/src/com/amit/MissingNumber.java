package com.amit;

// https://leetcode.com/problems/missing-number/
// Amazon Question
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int ans = missing((arr));
        System.out.println(ans);

    }

    static int missing(int[] arr){
        sort(arr);
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        // Case II
        return arr.length;
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i]; // Given that the question starts from 0 till N (size of the array)
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }
}