package com.amit;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18}; // Ascending order
        int target = 15;

        int ans = floor(arr, target);
        System.out.println(ans);
    }

    // Floor of a number, means the greatest number that is less than/equal to the target
    // if it is equal to the target, the code for this will be completely same as normal BinarySearch
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start  + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
