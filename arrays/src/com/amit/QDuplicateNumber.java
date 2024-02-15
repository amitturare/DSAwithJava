package com.amit;

import java.util.Arrays;

public class QDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};

        System.out.println(Arrays.toString(arr));
        System.out.println(removeDuplicates(arr));

    }

    static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
