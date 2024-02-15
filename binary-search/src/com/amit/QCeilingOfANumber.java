/*
    Q: Find the ceiling of a number in a sorted array.
    Example: [2, 3, 5, 9, 14, 16, 18]

    If target = 14, ceiling number = 14
    If target = 15, ceiling number = 16
    If target = 4, ceiling number = 5
    If target = 9, ceiling number = 9
    Thus, the ceiling number = smallest element in the array >= target

    Logic: If you are not finding the element, don't return -1,
           return the just next greater element.

           When the while loop will break in the end that is
           when start <= end, start will be end + 1. The ceiling.
*/

package com.amit;

public class QCeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 19;

        System.out.println("Ceiling for " + target + " is: " + ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // /If the target is greater than the greatest number of the arr,
        if (target > arr[end]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return target;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
