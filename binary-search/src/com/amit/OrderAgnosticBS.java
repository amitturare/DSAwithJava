package com.amit;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89}; // Ascending order array
        int[] arr2 = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;

        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether arr is sorted in ascending or descending
        /*
            boolean isAsc;
            if (arr[start] < arr[end]) {
                isAsc = true;
            } else {
                isAsc = false;
            }
         */
        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start)/2;

            // if (mid == target)... this condition is same for both ascending and descending orders
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid -1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
