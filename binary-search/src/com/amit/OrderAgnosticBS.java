package com.amit;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arrA = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] arrD = {20, 18, 16, 14, 12, 10, 8, 6, 4, 2};
        int target = 8;

        System.out.println(orderAgnosticBinarySearch(arrA, target));
        System.out.println(orderAgnosticBinarySearch(arrD, target));
    }

    static boolean isAscending(int[] arr) {
        return arr[0] < arr[arr.length -1];
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending(arr)) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
