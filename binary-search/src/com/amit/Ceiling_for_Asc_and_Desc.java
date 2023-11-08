package com.amit;

public class Ceiling_for_Asc_and_Desc {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18}; // Ascending order
        int[] arr1 = {18, 16, 14, 9, 5, 3, 2}; // Descending order
        int target = 18;

        int ans = ceiling_for_Asc_and_Desc(arr1, target);
        System.out.println(ans);
    }

    static int ceiling_for_Asc_and_Desc(int[] arr, int target) {

        if (target > arr[arr.length -1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == mid) {
                return arr[mid];
            }
            if (isAsc) {
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
        if (isAsc) {
            return arr[start]; // OR: return arr[end+1];
        } else {
            return arr[end]; // OR: return arr[start -1];
        }
    }
}
