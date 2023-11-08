package com.amit;

public class SplitArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            // in the end of the above loop, this will contain the max item from the array
            // Now,
            end += nums[i];
        }

        // binary search
        while (start < end) {
            // try for the middle as potential ans
            int mid = start + (end - start) / 2;

            // calculate how many pieces u can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num: nums) {
                if (sum + num > mid) {
                    // you can not add this in this subarray, make new one
                    // say you add this num in new subarray, thenm sum = num
                    sum = num;
                    pieces ++;
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start; // OR: return end; both will give same output
    }
}
