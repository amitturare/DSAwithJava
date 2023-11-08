package com.amit;

public class SearchInRange {
    public static void main(String[] args) { // Q: Search for 3 in range of index [1, 4]
        int[] nums = {18, 12, -7, 3, 14, 28};
        int target = 3;

        int ans = inRange(nums, target, 1, 4);
        System.out.println(ans);
    }

    static int inRange(int[] arr, int target, int lower, int upper) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = lower; index <= upper ; index++) {
            if (target == arr[index]) {
                return index;
            }
        }
        return -1;
    }
}
