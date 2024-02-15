/*
    Q: Find the floor of a number in a sorted array.
    Example: [2, 3, 5, 9, 14, 16, 18]

    If target = 14, floor number = 14
    If target = 15, floor number = 14
    If target = 4, floor number = 3
    If target = 9, floor number = 9
    Thus, the floor number = greatest element in the array <= target

    Logic: If you are not finding the element, don't return -1,
           return the just next greater element.

           When the while loop will break in the end that is
           when start <= end, end will be start - 1. The floor .
*/

package com.amit;

public class QFloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 14;

        System.out.println("Floor for " + target + " is: " + floor(arr, target));
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // if the target is smaller than the smallest number of the arr,
        if (target < arr[start]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target <= arr[mid]) {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
