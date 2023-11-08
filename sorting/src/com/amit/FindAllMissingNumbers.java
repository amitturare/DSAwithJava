package com.amit;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Google Question
// https://leetcode.com/problems/find-the-duplicate-number/
// Amazon Question
import java.util.ArrayList;
import java.util.List;

class FindAllMissingNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Sort the array (nums)
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // Find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }
}