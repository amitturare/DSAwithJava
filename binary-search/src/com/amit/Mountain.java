package com.amit;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Mountain {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // you are in decreasing part of array
                // this may be the answer or look behind in the array (left side of the middle element)
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in ascending part of the array
                // this may be the answer or look ahead in the array (right side of the middle element)
                start = mid + 1; // because we know that mid + 1 element > mid element
            }
        }
        // in the end , start == end and pointing to the largest number because of the checks above.
        // start and end are always going to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is wat the checks say

        // more elaboration:
        // At every point of start and end, the have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence because of the above line that is the best possible ans
        return start; // OR: return end; as both are equal!!!
    }
}
