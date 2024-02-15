// Question: #714, https://leetcode.com/problems/find-smallest-letter-greater-than-target/
/*
    We are not finding the equal to the
*/

package com.amit;

public class QCeilingOfALetter {
    public static void main(String[] args) {
        char[] arr = {'c','f','j','y'};
        char target = 'f';

        System.out.println("Next Greatest Letter: " + nextGreatestLetter2(arr, target));
    }

    static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        // If the target is last or greater than last element,
        if (target >= arr[end]) {
            return arr[start];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If target greater or equal to mid element
            if (target >= arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return arr[start];
    }

    // OR, with the help of modulo

    static char nextGreatestLetter2(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target >= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
}
