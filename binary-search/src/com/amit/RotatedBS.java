package com.amit;
// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 1));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // If you didn't find a pivot, it means array is not rotated...
        if (pivot == -1) { // Do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If pivot is found, 2 ascending sorted arrays are found
        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }

    // This will not work for duplicate values
    static int findPivot(int[] arr) {
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
            if (arr[mid] <= arr[start]) { // Case 3
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // If the target is not there in the arr, -1 will be returned
    }

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





