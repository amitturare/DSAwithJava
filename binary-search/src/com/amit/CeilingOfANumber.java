package com.amit;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18}; // Ascending order
        int target = 17;

        int ans = ceiling(arr, target);
        System.out.println(ans);
    }


    // Ceiling of a number, means to find the smallest number that is greater/equal to the target
    // if it is equal to the target, the code for this will be completely same as normal BinarySearch
    static int ceiling(int[] arr, int target) { // for ascending only

        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length -1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } if (target < arr[mid]) {
                end = mid - 1;
            } if (target == arr[mid]) {
                return arr[mid];
            }
        }
        return arr[end+1]; // OR: return arr[start];
    }
}
