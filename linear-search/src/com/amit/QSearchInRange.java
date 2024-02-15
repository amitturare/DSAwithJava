package com.amit;

public class QSearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int target = 11;
        int start = 2;
        int end = 7;

        System.out.println("Index of target: " + searchInRange(arr, target, start, end));
    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
