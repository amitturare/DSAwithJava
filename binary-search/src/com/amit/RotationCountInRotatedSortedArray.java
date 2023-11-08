package com.amit;
// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationCountInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(rotationCounts(nums));
    }

    static int rotationCounts(int[] arr) {
        int pivot = findPivot(arr);
        if (pivot == -1) {
            // array is not rotated
            return 0;
        } else {
            return pivot + 1;
        }

    }

    // use this for non duplicates
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // use this for arr having duplicates
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 Cases
            if (mid < end && arr[mid] > arr[mid + 1]) { // Case 1
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) { // Case 2
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates

                // NOTE: what if these elements at start and end were the pivot??
                // Check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start ++;

                // Check whether end element is pivot
                if (arr[end] < arr[end - 1]) {
                    return end-1;
                }
                end --;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // If the target is not there in the arr, -1 will be returned
    }
}
