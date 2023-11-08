package com.amit;
// https://leetcode.com/problems/find-in-mountain-array/
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int peakElement = this.peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peakElement);
        return firstTry != -1 ? firstTry : orderAgnosticBS(arr, target, peakElement + 1, arr.length() - 1);

    }

    // Create a function for order agnostic binary search
    private int orderAgnosticBS(MountainArray arr, int target, int start, int end) {
        boolean isAsc = arr.get(start) < arr.get(end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr.get(mid)) {
                return mid;
            }
            if (isAsc) {
                if (target < arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    private int peakIndexInMountainArray(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid)> arr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
